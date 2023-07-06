package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	/**
	 * 名前
	 */
	@Column(name = "username")
	private String username;

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
		
}
