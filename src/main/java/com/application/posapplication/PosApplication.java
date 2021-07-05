package com.application.posapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PosApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PosApplication.class, args);
    }

}
