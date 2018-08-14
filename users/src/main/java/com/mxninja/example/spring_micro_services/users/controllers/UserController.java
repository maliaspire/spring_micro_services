package com.mxninja.example.spring_micro_services.users.controllers;

import com.mxninja.example.spring_micro_services.users.domain.User;
import com.mxninja.example.spring_micro_services.users.models.UserModel;
import com.mxninja.example.spring_micro_services.users.repository.UserRepository;
import com.mxninja.example.spring_micro_services.users.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 8/14/2018
 *
 * @author Mohammad Ali
 */

@RestController("users")
public class UserController {

    private final RegistrationService REGISTRATION_SERVICE;
    private final UserRepository USER_REPOSITORY;

    @Autowired
    public UserController(RegistrationService registrationService, UserRepository userRepository) {
        REGISTRATION_SERVICE = registrationService;
        USER_REPOSITORY = userRepository;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Mono<Boolean>> addUser(@RequestBody UserModel body) {
        if (StringUtils.isEmpty(body.getEmail()) ||
                StringUtils.isEmpty(body.getPassword()) ||
                StringUtils.isEmpty(body.getConfirmPassword()) ||
                StringUtils.isEmpty(body.getName())) {
            return new ResponseEntity<>(Mono.just(false), HttpStatus.BAD_REQUEST);
        }

        if (!body.getPassword().equals(body.getConfirmPassword())) {
            return new ResponseEntity<>(Mono.just(false), HttpStatus.BAD_REQUEST);
        }

        if (USER_REPOSITORY.isExist(body.getEmail()) != null) {
            return new ResponseEntity<>(Mono.just(false), HttpStatus.BAD_REQUEST);
        }

        String password = body.getPassword();
        String salt = BCrypt.gensalt(12);
        String hashedPassword = BCrypt.hashpw(password, salt);

        User user = new User();
        user.setEmail(body.getEmail());
        user.setName(body.getName());
        user.setHashPassword(hashedPassword);
        System.out.println(REGISTRATION_SERVICE.saveUser(user).getUid());
        return new ResponseEntity<>(Mono.just(true), HttpStatus.CREATED);
    }
}
