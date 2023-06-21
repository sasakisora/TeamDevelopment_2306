package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
/**
 * ユーザー情報 Controller
 */
@Controller
public class UserController {
  /**
   * ユーザー情報 Service
   */
  //2行追加

  /**
   * ユーザー情報一覧画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面のHTML
   */
  @RequestMapping("/user/list")
	public String displayList(Model model) {

    //3行追加



  }
}
```

Serviceクラスの作成<br>
具体的な処理（ビジネスロジック）を記述するServiceクラスを作成します。

[com.example.demo.service.UserService.java]
```java
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

/**
 * ユーザー情報 Service
 */
@ここに追加
@Transactional(rollbackFor = Exception.class)
public class UserService {
	/**
	 * ユーザー情報 Repository
	 */
	//2行追加

	/**
	 * ユーザー情報 全検索
	 * @return 検索結果
	 */
	public List<UserEntity> searchAll() {
		//1行追加

	}
```
