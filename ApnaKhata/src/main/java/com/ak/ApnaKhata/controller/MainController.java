package com.ak.ApnaKhata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String welcomePage() {
		System.out.println("Hiiiiiiiii");
		return "login";
	}
	
	@GetMapping("/register")
	public String registerPage() {
		System.out.println("Hellololo");
		return "register";
	}
}
