package com.tech.spring.operations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
	@RequestMapping("/add")
	public void addNumbers() {
		System.out.println("Sum of the numbers method triggered...!!!");
	}
}
