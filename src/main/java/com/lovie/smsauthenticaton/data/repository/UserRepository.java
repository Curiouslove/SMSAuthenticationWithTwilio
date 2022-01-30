package com.lovie.smsauthenticaton.data.repository;

import com.lovie.smsauthenticaton.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByPhoneNumber(String phoneNumber);
}
