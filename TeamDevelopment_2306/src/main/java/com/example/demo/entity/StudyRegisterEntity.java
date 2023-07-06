package com.example.demo.entity;

import java.sql.Date;
import java.sql.Time;

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
	private Long id;

	/**
	 * ユーザーID
	 */
	@Column(name = "user_id")
	private String userId;

	/**
	*日付
	*/
	@Column(name = "study_date")
	private Date studyDate;

	/**
	*目標時間
	*/
	@Column(name = "target_time")
	private Time targetTime;

	/**
	*学習時間
	*/
	@Column(name = "study_time")
	private Time studyTime;
	
//	/**
//	 * 備考欄
//	*/
//	@Column(name = "remarks")
//	private String remarks;

}
