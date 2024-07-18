package com.spring.multicontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootClass {
	@RequestMapping("/springBootData")
	public String displaySpringBootData() {
		return "springBootDisplay";
	}
}
