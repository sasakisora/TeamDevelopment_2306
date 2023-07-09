package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEditEntity;
import com.example.demo.form.UserEditForm;
import com.example.demo.repository.UserEditRepository;


/**
 * ユーザー情報 Service
 */
@Service
public class UserEditService{
	/**
	 * ユーザー情報 Repository
	 */
	@Autowired
	private UserEditRepository userEditRepository;

	/**
	*ユーザー情報　検索
	*return 検索結果
	*/
	public UserEditEntity getUsersById(Integer id){
		return userEditRepository.getOne(id);
	}

	/**
	*ユーザー情報更新
	*@param userユーザー情報
	*/
	public void  updateUsersById(UserEditForm userEditForm) {
		UserEditEntity upUser = getUsersById(userEditForm.getId());
		upUser.setUsername(userEditForm.getUsername());
		upUser.setEmail(userEditForm.getEmail());
		upUser.setPassword(userEditForm.getPassword());
		userEditRepository.save(upUser);
	}
	
	/**
	*編集可能かチェック
	*/
	

	/**
	*ユーザー情報削除
	*/
	public void delete(Integer id) {
		UserEditEntity user = getUsersById(id);
		userEditRepository.delete(user);
	}
}
