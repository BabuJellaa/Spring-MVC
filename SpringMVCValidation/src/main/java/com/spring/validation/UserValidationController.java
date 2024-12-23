package com.spring.validation;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserValidationController {

	@RequestMapping("/login")
	public  String getLoginredirect(
			Model model) {
		model.addAttribute("user", new UserCredentials());
		return "user-form";
	}

	@RequestMapping("/submitForm")
	public String getCredentialsValidation(
			@Valid @ModelAttribute("user") UserCredentials credentials,
			BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return "error-result";
		}else {
			return "success-result";
		}
	}
}
