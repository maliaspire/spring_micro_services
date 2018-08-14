package com.mxninja.example.spring_micro_services.users.repository;

import com.mxninja.example.spring_micro_services.users.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * 8/14/2018
 *
 * @author Mohammad Ali
 */

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    
    @Query("FROM User WHERE LOWER(email) = LOWER(:email)")
    User isExist(@NonNull @Param("email") String email);

}
