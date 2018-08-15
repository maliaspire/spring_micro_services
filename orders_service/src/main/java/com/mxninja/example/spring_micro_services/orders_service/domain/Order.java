package com.mxninja.example.spring_micro_services.orders_service.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

/**
 * 8/15/2018
 *
 * @author Mohammad Ali
 */

@Setter
@Getter
@EqualsAndHashCode(of = "uid")
public class Order {

    @Id
    private UUID uid;

    private UUID userUid;

    private double price;


}
