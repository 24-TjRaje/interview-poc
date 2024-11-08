package com.interview.interview_poc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.UUID;

@Configuration
public class SingletonClass {

    @Bean
    public BeanExample goodMorning() {
        return new BeanExample(UUID.randomUUID(), "singleton");
    }

    @Bean
    @Scope("prototype")
    public BeanExample goodMorningPrototype() {
        return new BeanExample(UUID.randomUUID(), "prototype");
    }

    @Bean
    @Scope("request")
    public BeanExample goodMorningRequest() {
        return new BeanExample(UUID.randomUUID(), "request");
    }

    @Bean
    @Scope("session")
    public BeanExample goodMorningSession() {
        return new BeanExample(UUID.randomUUID(), "session");
    }
}