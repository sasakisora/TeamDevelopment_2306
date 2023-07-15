package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserSession;
import com.example.demo.repository.UserSessionRepository;

@Service
public class AuthService {

    @Autowired
    private UserSessionRepository userSessionRepository;

    public void logout() {
        // ログアウト処理を実装する
        // セッションの破棄やログアウトイベントの発行などを行う
        // 例えば以下のように実装できます
        UserSession userSession = userSessionRepository.getCurrentUserSession();
        if (userSession != null) {
            userSessionRepository.delete(userSession);
        }
        // その他のログアウト処理
    }
}