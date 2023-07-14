package com.example.demo.entity;

import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 学習時間登録 Entity
 */
@Data
@Entity
@Table(name = "study_times")

public class StudyRegisterEntity {

	/**
	 * ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	/**
	 * ユーザーID
	 */
	@Column(name = "user_id")
	private Integer user_id;

	/**
	*日付
	*/
	@Column(name = "study_date")
//	@NotNull(message="日付を入力してください。")
	private Date study_date;

	/**
	*目標時間
	*/
	@Column(name = "target_time")
//	@NotNull(message="目標時間を入力してください。")
	private LocalTime target_time;//time→localtime

	/**
	*学習時間
	*/
	@Column(name = "study_time")
//	@NotNull(message="学習時間を入力してください。")
	private LocalTime study_time;

}
