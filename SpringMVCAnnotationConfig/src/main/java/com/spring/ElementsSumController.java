package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ElementsSumController {

	@RequestMapping("/userSum")
	public ModelAndView sum(
			@RequestParam("number1") String number1,
			@RequestParam("number2") String number2,
			ModelAndView model) {

		int sum=Integer.parseInt(number1)+Integer.parseInt(number2);
		model.setViewName("sum");
		model.addObject("result", sum);
		
		return model;
	}
}
