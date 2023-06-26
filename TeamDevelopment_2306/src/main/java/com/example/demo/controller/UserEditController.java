package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.UserEditEntity;
import com.example.demo.service.UserEditService;

public class UserEditController{

	@Autowired
	private UserEditService userEditService;

	/**
	 *ユーザー情報詳細画面を表示
	 *@param id 表示するユーザーid
	 *@param model Model
	 *@return ユーザー情報編集完了画面
	 */
	@GetMapping("/users/{id}edit")
	public String displayEdit(@PathVariable("id") Long id, Model model){
		UserEditEntity users = userEditService.getUsersById(id);
		model.addAttribute("users",users);
		return "/users/{id}edit";
	}

	/*@PostMapping("/users/{id}edit")
	public String displayEdit(@PathVariable("id") Long id, @ModelAttribute("users")UserEditEntity users, Model model){
		userEditService.updateUsers(users);
		UserEditEntity updatedUser = userEditService.getUsersById(id);
		model.addAttribute("users"updatedUsers);
		//更新後のページにリダイレクト
		return "/users/{id}edit";
	}

	/**
	 *@param id 表示するユーザーid
	 *@param model Model
	 *@return ユーザー情報削除完了画面
	 */
	/*@GetMapping("/users/{id}delete")
	public String delete(@PathVariable Long id, Model model) {
		//ユーザー情報の削除
		userEditService.delete(id);
		return "/users/{id}edit";
	}*/
}



