package com.lovie.smsauthenticaton.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
    @OneToOne
    private OTP otp;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Authority> authorities;
}
