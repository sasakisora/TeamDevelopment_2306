package com.example.demo.form;

import java.sql.Date;
import java.sql.Time;

public class StudyRegisterForm {
		private Integer id;
	    private Integer user_id;
	    private Date study_date;
	    private Time target_time;
	    private Time study_time;
	    
	 // コンストラクタ、ゲッター、セッターなどのメソッド

	    // フィールドのゲッターとセッターメソッド
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public Integer getUser_id() {
	        return user_id;
	    }

	    public void setUser_id(Integer user_id) {
	        this.user_id = user_id;
	    }

	    public Date getStudy_date() {
	        return study_date;
	    }

	    public void setStudy_date(Date study_date) {
	        this.study_date = study_date;
	    }

	    public Time getTarget_time() {
	        return target_time;
	    }

	    public void setTarget_time(Time target_time) {
	        this.target_time = target_time;
	    }
	    
	    public Time getStudy_time() {
	        return study_time;
	    }

	    public void setStudy_time(Time study_time) {
	        this.study_time = study_time;
	    }
}
