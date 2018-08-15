package com.mxninja.example.spring_micro_services.orders_service;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * 8/15/2018
 *
 * @author Mohammad Ali
 */

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    public MongoClient mongoClient() {
        return new MongoClient("127.0.0.1");
    }

    @Override
    protected String getDatabaseName() {
        return "spring_test";
    }
}
