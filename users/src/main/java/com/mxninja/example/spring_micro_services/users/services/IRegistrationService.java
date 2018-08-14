package com.mxninja.example.spring_micro_services.users.services;

import com.mxninja.example.spring_micro_services.users.domain.User;

/**
 * 8/14/2018
 *
 * @author Mohammad Ali
 */
public interface IRegistrationService {

    User saveUser(User user);

}
