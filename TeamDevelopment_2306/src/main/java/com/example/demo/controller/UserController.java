package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@Controller
public class UserController{
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        try {
            // 認証を実行
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(email, password));

            // 認証情報をセキュリティコンテキストに設定
            SecurityContextHolder.getContext().setAuthentication(authentication);

            // ログイン成功時の処理
            return "redirect:/home";
        } catch (BadCredentialsException ex) {
            // ログイン失敗時の処理
            model.addAttribute("error", true);
            model.addAttribute("errorMessage", "passwordまたはEmailが違います。");
            return "login";
        }
    }

    @GetMapping("/home")
    public String showHomePage(Model model) {
        // 認証されたユーザーの情報を取得
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = userDetails.getUsername();

        // ユーザー情報をモデルに設定
        UserEntity userEntity = userRepository.findByUsername(username).orElse(null);
        model.addAttribute("user", userEntity);

        return "home";
    }
}