package com.interview.interview_poc;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class ProfileServiceQaImpl implements ProfileService {
    @Override
    public String envMessage() {
        return "This is qa env running on port 8082";
    }
}
