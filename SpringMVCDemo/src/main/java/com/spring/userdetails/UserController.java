package com.spring.userdetails;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/displaySurname")
	public String displaySurname() {
		return "displaySurname";
	}
	
	@RequestMapping("/displayFullname")
	public String displayFullName() {
		return "displayFullname";
	}
}
