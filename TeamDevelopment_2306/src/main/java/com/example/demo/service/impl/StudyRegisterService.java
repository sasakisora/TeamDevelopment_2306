package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudyRegisterEntity;
import com.example.demo.form.StudyRegisterForm;
import com.example.demo.repository.StudyRegisterRepository;

@Service
public class StudyRegisterService {
	
	@Autowired
	private StudyRegisterRepository studyRegisterRepository;
	/*
	 * ユーザー情報検索
	 * return 検索結果
	 */
	public StudyRegisterEntity getStudy_timesById(Integer id) {
		return studyRegisterRepository.getOne(id);
	}
	
	/*
	 * 学習時間登録
	 */
	public void register(StudyRegisterForm studyRegisterForm) {
	StudyRegisterEntity studyRegister = getStudy_timesById(studyRegisterForm.getId());
	studyRegister.setUser_id(studyRegisterForm.getUser_id());// ユーザーIDを設定
    studyRegister.setStudy_date(studyRegisterForm.getStudy_date());// 現在の日付を設定
    studyRegister.setTarget_time(studyRegisterForm.getTarget_time());// 目標時間を設定
    studyRegister.setStudy_time(studyRegisterForm.getStudy_time());// 学習時間を設定
    studyRegisterRepository.save(studyRegister);//データベースに登録
	}

	/*
	 * 学習時間登録完了
	 */
	
}
