package com.spring.requestparamannotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsingModelAndViewInterface {
	@RequestMapping("/userLogin")
	public ModelAndView userLogin(
			@RequestParam("username")String username,
			@RequestParam("password")String password,
			ModelAndView view) {
		
		//here we are setting the view name using ModelAndView.
		view.setViewName("loginSuccess.jsp");
		view.addObject("User login", username);
	
		//here we are returning view and also we can return model attributes. and in the JSP we should do view.getAttribute("User login")
		return view;
	}
}
