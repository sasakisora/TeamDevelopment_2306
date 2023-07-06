package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserEditEntity;

@Repository
public interface UserEditRepository extends JpaRepository<UserEditEntity, Integer>{


}
