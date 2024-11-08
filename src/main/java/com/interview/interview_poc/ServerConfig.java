package com.interview.interview_poc;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ServerConfig {

    @Profile("dev")
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return factory -> factory.setPort(8081); // Set the port here
    }

    @Profile("qa")
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizerQa() {
        return factory -> factory.setPort(8082); // Set the port here
    }

    @Profile("prod")
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizerProd() {
        return factory -> factory.setPort(8083); // Set the port here
    }
}