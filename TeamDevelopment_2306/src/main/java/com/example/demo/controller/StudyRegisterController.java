package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.StudyRegisterForm;
import com.example.demo.service.impl.StudyRegisterService;

@Controller
public class StudyRegisterController {
	
	@Autowired
	private StudyRegisterService studyRegisterService;
	
	/*
	 *学習時間登録画面を表示
	 *@param model Model
	 *@return 学習時間登録画面
	 */
	@GetMapping("/study/register")
	public String displayRegister(Model model) {
		model.addAttribute("studyRegisterForm",new StudyRegisterForm());
	    return "common/StudyRegister";
	}
	
	/*
	 * 学習時間の登録
	 * @param model Model
	 * return 学習時間登録完了画面を表示
	 */
//    @PostMapping("/study/register2")
//    public String register(@Validated @ModelAttribute StudyRegisterForm studyRegisterForm, BindingResult result, Model model) {
//    	if (result.hasErrors()) {
//    	      // 入力チェックエラーの場合
//    	      List<String> errorList = new ArrayList<String>();
//    	      for (ObjectError error : result.getAllErrors()) {
//    	        errorList.add(error.getDefaultMessage());
//    	      }
//    	      model.addAttribute("validationError", errorList);
//    	      return "/common/StudyRegister";
//    	    }
//    studyRegisterService.register(studyRegisterForm);
//    return "/common/StudyRegister";
//    }
    @PostMapping("/study/register2")
    public String register(@Validated @ModelAttribute StudyRegisterForm studyRegisterForm, Model model) {
    model.addAttribute("studyRegisterForm",new StudyRegisterForm());
    studyRegisterService.register(studyRegisterForm);
    return "/common/StudySuccess";
    }
    
    /*
     * 登録完了画面を表示
     * @param model Model
     * return 学習時間登録完了画面を表示
     */
    @PostMapping("/study/success")
    public String displayView(Model model) {
    	return "common/StudySuccess";
    }
    
}
