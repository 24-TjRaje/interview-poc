package com.interview.interview_poc.student.configuration;

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
        basePackages = "com.interview.interview_poc.student.repository",
        entityManagerFactoryRef = "studentEntityManager",
        transactionManagerRef = "studentTransactionManager"
)
public class StudentDatabaseConfiguration {

    @Autowired
    private Environment environment;

    @Primary
    @Bean
    public DriverManagerDataSource studentDataSource() {
        DriverManagerDataSource dmds = new DriverManagerDataSource();
        dmds.setUrl(environment.getProperty("spring.datasource.url"));
        dmds.setUsername(environment.getProperty("spring.datasource.username"));
        dmds.setPassword(environment.getProperty("spring.datasource.password"));
        dmds.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
        return dmds;
    }

    @Primary
    @Bean(name="studentEntityManager")
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {

        LocalContainerEntityManagerFactoryBean lcem = new LocalContainerEntityManagerFactoryBean();
        lcem.setDataSource(studentDataSource());
        lcem.setPackagesToScan("com.interview.interview_poc.student.entities");

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
    @Bean(name="studentTransactionManager")
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager ptm = new JpaTransactionManager();
        ptm.setEntityManagerFactory(localContainerEntityManagerFactoryBean().getObject());
        return ptm;
    }
}
