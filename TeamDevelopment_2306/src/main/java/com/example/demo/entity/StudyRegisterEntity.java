package com.example.demo.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
	@NotNull(message="ユーザーIDを入力してください。")
	private Integer user_id;

	/**
	*日付
	*/
	@Column(name = "study_date")
	@NotNull(message="日付を入力してください。")
	private Date study_date;

	/**
	*目標時間
	*/
	@Column(name = "target_time")
	@NotNull(message="目標時間を入力してください。")
	private Time target_time;

	/**
	*学習時間
	*/
	@Column(name = "study_time")
	@NotNull(message="学習時間を入力してください。")
	private Time study_time;

}
