package com.interview.interview_poc.endpoint;


import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Endpoint(id = "customData")
@Component(value = "customEndpoint")
public class CustomActuatorEndpoints {

    @ReadOperation
    public String helloMessage() {
        return  "Hello from Tejas!";
    }

    @WriteOperation
    public String writeOperation(String name) {
        return "Hello, " + name;
    }

    @DeleteOperation
    public String deleteOperation() {
        return "Delete operation performed";
    }

}
