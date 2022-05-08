package com.ak.ApnaKhata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ak.ApnaKhata.beans.LoginRequestBean;
import com.ak.ApnaKhata.beans.Users;
import com.ak.ApnaKhata.repository.UserRepository;
import com.ak.ApnaKhata.service.UserService;

@Controller
public class MainController {

	@Autowired
	UserService userservice;
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/")
	public String welcomePage() {
		return "login";
	}
	
	@GetMapping("/register")
	public String registerPage() {
		return "registration";
	}
	@GetMapping("/logout")
	public String logout() {
		return "login";
	}
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello Sandy The Crandy";
	}
	@PostMapping("/login-process")
	public String loginProcess(@ModelAttribute LoginRequestBean login) {
		if(login != null) {
			System.out.println("----------Login process----------");
			System.out.println("username = "+login.getUsername());
			System.out.println("password = "+login.getPassword());
			//get the user
			Users user = this.userRepository.findByUserName(login.getUsername());
			
			if(user!=null) {
			
				if(login.getUsername().equals(user.getEmail()) && login.getPassword().equals(user.getPassword())) {
					System.out.println("Hiiiiiii");
					return "dashboard";
				}else {
				return "login";
				}
			}
		}
		
		return "login";
	}
	
	@PostMapping("/register-process")
	public String registerProcess(@ModelAttribute Users user) {
		System.out.println("------Register------------ Process------");
		System.out.println(user.getEmail());
		if(user != null) {
			Users userDetails = userservice.registerUser(user);
		}
		return "login";
	}
}
