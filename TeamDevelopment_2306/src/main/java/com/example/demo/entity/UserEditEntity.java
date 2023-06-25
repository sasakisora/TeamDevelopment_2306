package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */

@Entity
@Table(name = "users");


public class UserEditEntity {

	/**
	 * ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * 名前
	 */
	@Column(name = "username")
	private String userName;

	/**
	 * メールアドレス
	 */
	@Column(name = "email")
	private String email;

	/**
	 * パスワード
	 */
	@Column(name = "password")
	private int password;

	/**
	 * パスワード確認用
	 */
	@Column(name = "passwprd2")
	private int password2;
	
}
