package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.StudyRegisterEntity;
import com.example.demo.repository.StudyRegisterRepository;

public class StudyRegisterService {
	
	@Autowired
	private StudyRegisterRepository studyRegisterRepository;
	/*
	 * 学習時間登録
	 */
	public void registerStudyTime(StudyRegisterEntity model) {
	StudyRegisterEntity studyRegister = new StudyRegisterEntity();
	studyRegister.setUserId(model.getUserId());// ユーザーIDを設定
    studyRegister.setStudyDate(model.getStudyDate());// 現在の日付を設定
    studyRegister.setTargetTime(model.getTargetTime());// 目標時間を設定
    studyRegister.setStudyTime(model.getStudyTime());// 学習時間を設定
    
    studyRegisterRepository.save(studyRegister);//データベースに登録
	}

	/*
	 * 学習時間登録完了
	 */
}
