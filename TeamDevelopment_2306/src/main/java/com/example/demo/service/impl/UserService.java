package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Long Login(String E_mail, String password) {
        UserEntity user = UserRepository.findByEmail(E_mail);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            // ログイン成功の処理
            return user.getId();
        } else {
            // ログイン失敗の処理
            return null;
        }
    }
}