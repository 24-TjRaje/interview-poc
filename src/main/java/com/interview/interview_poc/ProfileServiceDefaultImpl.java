package com.interview.interview_poc;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class ProfileServiceDefaultImpl implements ProfileService {
    @Override
    public String envMessage() {
        return "This is default env running on port 8080";
    }
}
