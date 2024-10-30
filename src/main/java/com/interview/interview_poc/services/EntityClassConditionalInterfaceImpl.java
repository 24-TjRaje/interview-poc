package com.interview.interview_poc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnClass(name = "com.interview.interview_poc.services.Entity")
public class EntityClassConditionalInterfaceImpl implements ClassConditionalInterface {

    private static final Logger logger = LoggerFactory.getLogger(DevCondtionalBean.class);

    private final String message = "This is a class condition bean created when the Entity class is present";
    @Override
    public String classConditions() {
        logger.info("{}", message);
        return message;
    }
}
