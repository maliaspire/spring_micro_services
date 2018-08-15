package com.mxninja.example.spring_micro_services.orders_service.models;

import lombok.Data;

/**
 * 8/15/2018
 *
 * @author Mohammad Ali
 */

@Data
public class OrderModel {

    private String userUid;

    private Double price;

}
