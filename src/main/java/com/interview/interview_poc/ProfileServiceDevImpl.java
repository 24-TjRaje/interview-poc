package com.interview.interview_poc;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class ProfileServiceDevImpl implements ProfileService {

    @Override
    public String envMessage() {
        return "This is dev env running on port 8081";
    }
}
