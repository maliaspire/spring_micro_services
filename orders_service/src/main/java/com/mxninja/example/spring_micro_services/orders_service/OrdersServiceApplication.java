package com.mxninja.example.spring_micro_services.orders_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 8/15/2018
 *
 * @author Mohammad Ali
 */

@SpringBootApplication
@EnableEurekaClient
public class OrdersServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdersServiceApplication.class, args);
    }

}
