package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserSession;

@Repository
public interface UserSessionRepository extends CrudRepository<UserSession, Long> {

    UserSession getCurrentUserSession();

    // その他のセッションに関連するリポジトリメソッドを宣言する
    // 例: UserSession findBySessionId(String sessionId);
}