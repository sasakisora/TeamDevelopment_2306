package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // その他のセッション情報や関連するフィールドを追加する
    // 例: private String sessionId;

    // GetterとSetter、コンストラクタなどを実装する
    // ...

    // 必要に応じてtoString()メソッドをオーバーライドする
}