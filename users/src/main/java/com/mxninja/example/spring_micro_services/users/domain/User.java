package com.mxninja.example.spring_micro_services.users.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Setter
@Getter
@EqualsAndHashCode(of = "uid")
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "uid", updatable = false, nullable = false, unique = true)
    private UUID uid;

    @Column(name = "name")
    private String name;

    @Column(name = "hashPassword")
    private String hashPassword;

    @Column(name = "email", unique = true)
    private String email;

}
