package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.UserEditEntity;
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
//		UserEditForm userEditForm =new UserEditForm();
//		userEditForm.setId(user.getId());
//		userEditForm.setUsername(user.getUserName());
//		userEditForm.setEmail(user.getEmail());
//		userEditForm.setPassword(user.getPassword());
		model.addAttribute("user",user);
		return "common/UserEdit";
	}

//	@PostMapping("/users/{id}kodama")
//	public String displayEdit(@PathVariable("id") Long id, @ModelAttribute("users")UserEditEntity users, Model model){
//		userEditService.getUsersById(id);
//		UserEditEntity updatedUser = userEditService.getUsersById(id);
//		model.addAttribute("users",updatedUser);
//		//更新後のページにリダイレクト
//		return "common/userEditSuccess";
//	}

	/**
	 *@param id 表示するユーザーid
	 *@param model Model
	 *@return ユーザー情報削除完了画面
	 */
/*	@GetMapping("/users/{id}delete")
	public String delete(@PathVariable Long id, Model model) {
		//ユーザー情報の削除
		userEditService.delete(id);
		return "";
	}
	*/
}



