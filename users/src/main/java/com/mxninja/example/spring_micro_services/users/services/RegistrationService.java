package com.mxninja.example.spring_micro_services.users.services;

import com.mxninja.example.spring_micro_services.users.domain.User;
import com.mxninja.example.spring_micro_services.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 8/14/2018
 *
 * @author Mohammad Ali
 */

@Service
public class RegistrationService implements IRegistrationService {

    private UserRepository userRepository;

    @Autowired
    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
