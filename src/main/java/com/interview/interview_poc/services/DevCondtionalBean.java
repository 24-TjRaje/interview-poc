package com.interview.interview_poc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service
@ConditionalOnProperty(name = "set.env",havingValue = "dev", matchIfMissing = true)
//@ConditionalOnProperty(name = "conflict.one",havingValue = "true", matchIfMissing = true)
public class DevCondtionalBean implements ConditionalInterface{

    private static final Logger logger = LoggerFactory.getLogger(DevCondtionalBean.class);

    private final String msg = "This bean is created and triggered when the env is set to dev";

    @Override
    public String environmentBean() {
        logger.info("{}", msg);
        return msg;
    }




}
