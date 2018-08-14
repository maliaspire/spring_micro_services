package com.mxninja.example.spring_micro_services.users.models;

import lombok.Data;

/**
 * 8/14/2018
 *
 * @author Mohammad Ali
 */

@Data
public class LoginModel {

    private String username;
    private String hashPassword;

    public LoginModel(String username, String hashPassword) {
        this.username = username;
        this.hashPassword = hashPassword;
    }

    public LoginModel() {
    }
}
