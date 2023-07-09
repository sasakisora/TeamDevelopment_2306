package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.UserEditEntity;
import com.example.demo.form.UserEditForm;
import com.example.demo.service.UserEditService;

	@Controller
	public class UserEditController{
		
	@Autowired
	private UserEditService userEditService;

	/**
	 *ユーザー情報詳細画面を表示
	 *@param id 表示するユーザーid
	 *@param model Model
	 *@return ユーザー情報編集完了画面
	 */
	@GetMapping("/user/edit/{id}")
	public String displayEdit(@PathVariable Integer id, Model model){
		UserEditEntity user = userEditService.getUsersById(id);
		UserEditForm userEditForm =new UserEditForm();
		userEditForm.setId(user.getId());
		userEditForm.setUsername(user.getUsername());
		userEditForm.setEmail(user.getEmail());
		userEditForm.setPassword(user.getPassword());
		model.addAttribute("userEditForm",userEditForm);
		return "common/UserEdit";
	}

	@PostMapping("/user/update")
	public String displayEdit(@ModelAttribute UserEditForm userEditForm, Model model){
//		if(result.hasErrors()) {
//			return "";
//		}
		userEditService.updateUsersById(userEditForm);
		model.addAttribute("userEditForm",userEditForm);
		return "common/UserEditSuccess";//更新後のページにリダイレクト
	}

	/**
	 *@param id 表示するユーザーid
	 *@param model Model
	 *@return ユーザー情報削除完了画面
	 */
	@PostMapping("/user/delete")
	public String delete(Integer id, UserEditForm userEditForm, Model model) {
		userEditService.delete(id);//ユーザー情報の削除
		return "common/UserEditDelete";
	}
}

