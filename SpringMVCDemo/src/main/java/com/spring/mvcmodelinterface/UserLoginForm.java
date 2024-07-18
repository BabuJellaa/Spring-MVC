package com.spring.mvcmodelinterface;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/*The Model interface in Spring MVC is used to pass data from your controller to your view. 
It acts as a container for data that needs to be rendered by the view, 
allowing the controller to add attributes to the model which can then be accessed in the view.*/

@Controller
public class UserLoginForm {

	@RequestMapping("/login")
	public String userAuthentication(HttpServletRequest httpServletRequest,Model model) {

		String userName=httpServletRequest.getParameter("username");
		String password=httpServletRequest.getParameter("password");

		if(password.equals("Babu@4949")) {
			String displayMessage="Hello "+userName;

			// Add this displayMessage to the model
			model.addAttribute("message",displayMessage);
			return "loginSuccess";
		}
		else {
			String message="Sorry "+ userName+". You entered an incorrect password";  
			model.addAttribute("message", message);
			return "loginFail";
		}
	}
}
