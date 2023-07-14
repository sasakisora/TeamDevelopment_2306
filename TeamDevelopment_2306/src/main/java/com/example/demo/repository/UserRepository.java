package com.example.demo.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

    static UserEntity findByEmail(String e_mail) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }
    
     static User findByUsername(String username) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }
}