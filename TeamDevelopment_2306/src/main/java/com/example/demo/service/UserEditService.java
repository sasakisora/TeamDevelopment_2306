package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.entity.UserEditEntity;
import com.example.demo.repository.UserEditRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserEditService {
	/**
	 * ユーザー情報 Repository
	 */
	@Autowired
	private UserEditRepository userRepository;

	/**
	*ユーザー情報　全検索
	*return 検索結果
	*/
	public Users findById(Long id){
	return userEditRepository.findByld(id).get();
	}

	/**
	*ユーザー情報更新
	*@param userユーザー情報
	*/
	public void update(UserUpdateRequest userUpdateRequest){
	User user = findById(userUpdateRequest.getId());
	user.setUserName(userUpdateRequest.getUserName());
	user.setEmail(userUpdateRequest.getEmail());
	user.setPassword(userUpdateRequest.getPassword());
	user.setPassword2(userUpdateRequest.getPassword2());
	userEditRepository.save(user);
	}

	/**
	*編集可能かチェック
	*/
	public void edit

	/**
	*ユーザー情報削除
	*/
	public void deleteUserById(Integer id) {
        // ユーザーの存在確認
        Optional<UserEditEntity> userOptional = userEditRepository.findById(id);
        if (userOptional.isPresent()) {
            UserEditEntity user = userOptional.get();
            userEditRepository.delete(user);
        } else {
            throw new NotFoundException("指定されたユーザーは存在しません");
        }
    }

}
