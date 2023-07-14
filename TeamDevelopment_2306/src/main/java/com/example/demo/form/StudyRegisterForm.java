package com.example.demo.form;

import java.sql.Date;

public class StudyRegisterForm {
		private Integer id;
	    private Integer user_id;
	    private Date study_date;
	    private String target_time;//time→String型
	    private String study_time;//time→String型
	    
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

	    public String getTarget_time() {
	        return target_time;//
	    }

	    public void setTarget_time(String target_time) {
	        this.target_time = target_time;
	    }
	    
	    public String getStudy_time() {
	        return study_time;
	    }

	    public void setStudy_time(String study_time) {
	        this.study_time = study_time;
	    }
}
