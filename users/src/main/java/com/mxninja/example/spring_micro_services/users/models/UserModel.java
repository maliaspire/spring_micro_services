package com.mxninja.example.spring_micro_services.users.models;

import lombok.Data;

/**
 * 8/14/2018
 *
 * @author Mohammad Ali
 */

@Data
public class UserModel {

    private String email;
    private String password;
    private String confirmPassword;
    private String name;


}
