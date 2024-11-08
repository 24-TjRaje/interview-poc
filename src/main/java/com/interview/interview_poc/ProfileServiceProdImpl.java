package com.interview.interview_poc;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProfileServiceProdImpl implements ProfileService {
    @Override
    public String envMessage() {
        return "This is default prod running on port 8083";
    }
}
