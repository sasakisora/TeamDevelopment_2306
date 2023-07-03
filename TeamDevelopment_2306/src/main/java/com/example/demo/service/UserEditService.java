package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEditEntity;
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
	public UserEditEntity updateUsersById(Integer id, UserEditEntity userEditEntity) {
		UserEditEntity upUser = userEditRepository.getById(id);
		upUser.setUserName(userEditEntity.getUserName());
		upUser.setEmail(userEditEntity.getEmail());
		upUser.setPassword(userEditEntity.getPassword());
		upUser.setPassword2(userEditEntity.getPassword2());
		return upUser;
	}
	
	/**
	*編集可能かチェック
	*/
	

	/**
	*ユーザー情報削除
	*/
	/*public void delete(Long id) {
		Users users = findById(id);
		userEditRepository.delete(users);
	}
*/
}

