package com.interview.interview_poc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "set.env",havingValue = "qa")
public class QaConditionalBean implements ConditionalInterface{

    private final String msg = "This bean is created and triggered when the env is set to qa";

    private static final Logger logger = LoggerFactory.getLogger(QaConditionalBean.class);

    @Override
    public String environmentBean() {
        logger.info("{}", msg);
        return msg;
    }
}