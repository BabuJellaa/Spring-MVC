package com.spring.requestparamannotations;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginUsingRequestParamAnnotation {
	@RequestMapping("/userAuthentication")
	public String login(
			@RequestParam("username")String username,
			@RequestParam("password")String password,
			Model model) {
		
		if(password.equals("Babu@4949")) {
			String displayMessage="Hello "+username;

			// Add this displayMessage to the model
			model.addAttribute("message",displayMessage);
			return "loginSuccess";
		}
		else {
			String message="Sorry "+ username+". You entered an incorrect password";  
			model.addAttribute("message", message);
			return "loginFail";
		}
	}
}
