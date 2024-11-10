package com.interview.interview_poc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SpanishQualifierOpsImpl implements QualifierOps {
    @Override
    public String message() {
        return "Hola. Buenos Dias!!!";
    }
}
