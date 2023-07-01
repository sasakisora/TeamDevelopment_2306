package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.StudyRegisterEntity;
import com.example.demo.service.impl.StudyRegisterService;

public class StudyRegisterController {
	
	@Autowired
	private StudyRegisterService studyRegisterService;
	
	/*
	 *学習時間登録画面を表示
	 *@param model Model
	 *@return 登録完了画面画面のHTML
	 */
	@GetMapping("/studyInput/{id}register")
	public String displayRegister() {
	    return "common/StudyRegister";
	}
	
	/*
	 * 学習時間の登録
	 * @param model Model
	 * return ？？
	 */
    @PostMapping("/studyInput/{id}register")
    public String registerStudyTime(@ModelAttribute("studyRegister") StudyRegisterEntity studyRegister) {
    studyRegisterService.registerStudyTime(studyRegister);
    return "redirect:/common/StudySuccess";
    }
    
    /*
     * 登録完了画面を表示
     * @param model Model
     * return ？？
     */
    @GetMapping("/study/success")
    public String displaySuccess() {
    	return "common/StudySuccess";
    }
    
}
