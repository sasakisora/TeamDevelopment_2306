package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Data
@Entity
@Table(name = "users")
public class UserEditEntity {

	/**
	 * ID
	 */
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	private String password;

	/**
	 * パスワード確認用
	 */
	@Column(name = "password2")
	private String password2;
	
}
