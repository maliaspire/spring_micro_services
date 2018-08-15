package com.mxninja.example.spring_micro_services.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 8/14/2018
 *
 * @author Mohammad Ali
 */

@SpringBootApplication
@EnableEurekaClient
public class UsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class, args);
    }

}
