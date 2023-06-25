package com.example.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.UserEditEntity;
import com.example.demo.service.UserEditService;

public class UserEditController {
	
	UserEditService userEditService;
}

/**
*ユーザー情報詳細画面を表示
*@param id 表示するユーザーid
*@param model Model
*@return ユーザー情報詳細画面
*/
 @GetMapping("/users/{id}edit")
public String displayEdit(@PathVariable("id") Integer id, Model model){
UserEditEntity user = userEditService.getUserById(id);
model.addAttribute("user",user);
return "individualPage";
}

@PostMapping("/users/{id}edit")
public String displayEdit(@PathVariable("id") Integer id, @ModelAttribute("user") @Validated ここに記入 user, BindingResult Binding Result){

	if(BindingResult.hasErrors()){
		return "individualPageEdit";
	}
	//データの更新処理を実行
	userService.updateUser(user);

	//更新後のページにリダイレクト
	return "redirect:/individualPage/" + id;
	}
}
