package com.ak.ApnaKhata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ak.ApnaKhata.beans.LoginRequestBean;
import com.ak.ApnaKhata.beans.Users;
import com.ak.ApnaKhata.service.UserService;

@Controller
public class MainController {

	@Autowired
	UserService userservice;
	
	@GetMapping("/")
	public String welcomePage() {
		return "login";
	}
	
	@GetMapping("/register")
	public String registerPage() {
		return "registration";
	}
	@PostMapping("/login-process")
	public String loginProcess(@ModelAttribute LoginRequestBean login) {
		if(login != null) {
			System.out.println("----------Login process----------");
			System.out.println("username = "+login.getUsername());
			System.out.println("password = "+login.getPassword());
			if(login.getUsername().equals("javasoft@gmail.com") && login.getPassword().equals("12345678")) {
				System.out.println("Hiiiiiii");
				return "dashboard";
			}else {
				return "login";
			}
		}
		
		return "login";
	}
	
	@PostMapping("/register-process")
	public String registerProcess(@ModelAttribute Users user) {
		System.out.println("------Register Process------");
		System.out.println(user.getEmail());
		if(user != null) {
			Users userDetails = userservice.registerUser(user);
		}
		return "login";
	}
}
