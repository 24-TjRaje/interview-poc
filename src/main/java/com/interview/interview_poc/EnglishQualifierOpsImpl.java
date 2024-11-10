package com.interview.interview_poc;

import org.springframework.stereotype.Service;

@Service
public class EnglishQualifierOpsImpl implements QualifierOps {
    @Override
    public String message() {
        return "Hello. Good Morning!!!";
    }
}
