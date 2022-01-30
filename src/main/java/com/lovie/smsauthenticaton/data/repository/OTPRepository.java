package com.lovie.smsauthenticaton.data.repository;

import com.lovie.smsauthenticaton.data.model.OTP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OTPRepository extends JpaRepository<OTP, Long> {
}
