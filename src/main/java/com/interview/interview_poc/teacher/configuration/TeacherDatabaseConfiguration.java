package com.interview.interview_poc.teacher.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.interview.interview_poc.teacher.repository",
        entityManagerFactoryRef = "teacherEntityManager",
        transactionManagerRef = "teacherTransactionManager"
)
public class TeacherDatabaseConfiguration {

    @Autowired
    private Environment environment;

    @Primary
    @Bean
    public DriverManagerDataSource teacherDataSource() {
        DriverManagerDataSource dmds = new DriverManagerDataSource();
        dmds.setUrl(environment.getProperty("spring.second-datasource.url"));
        dmds.setUsername(environment.getProperty("spring.second-datasource.username"));
        dmds.setPassword(environment.getProperty("spring.second-datasource.password"));
        dmds.setDriverClassName(environment.getProperty("spring.second-datasource.driver-class-name"));
        return dmds;
    }

    @Primary
    @Bean(name="teacherEntityManager")
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {

        LocalContainerEntityManagerFactoryBean lcem = new LocalContainerEntityManagerFactoryBean();
        lcem.setDataSource(teacherDataSource());
        lcem.setPackagesToScan("com.interview.interview_poc.teacher.entities");

        HashMap<String, String> jpaProp = new HashMap<>();
        jpaProp.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        jpaProp.put("hibernate.show_sql", "true");
        jpaProp.put("hibernate.hbm2ddl.auto", "update");

        lcem.setJpaPropertyMap(jpaProp);

        JpaVendorAdapter jp = new HibernateJpaVendorAdapter();
        lcem.setJpaVendorAdapter(jp);
        return lcem;
    }

    @Primary
    @Bean(name="teacherTransactionManager")
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager ptm = new JpaTransactionManager();
        ptm.setEntityManagerFactory(localContainerEntityManagerFactoryBean().getObject());
        return ptm;
    }
}
