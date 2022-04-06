package com.kachan.registrationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RegistrationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationServerApplication.class, args);
    }

}
