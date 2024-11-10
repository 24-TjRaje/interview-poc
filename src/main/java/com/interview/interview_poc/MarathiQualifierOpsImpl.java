package com.interview.interview_poc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class MarathiQualifierOpsImpl implements QualifierOps {
    @Override
    public String message() {
        return "Namaskaar. Su-Prabhaat!!!";
    }
}
