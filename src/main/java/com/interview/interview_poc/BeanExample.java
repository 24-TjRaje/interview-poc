package com.interview.interview_poc;

import java.util.UUID;

public class BeanExample {

    private UUID id;
    private String scope;

    public BeanExample(UUID id, String scope) {
        this.id = id;
        this.scope = scope;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
