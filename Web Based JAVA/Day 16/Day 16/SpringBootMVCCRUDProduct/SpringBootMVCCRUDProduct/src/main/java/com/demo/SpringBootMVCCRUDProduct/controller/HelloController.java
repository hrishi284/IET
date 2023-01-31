package com.demo.SpringBootMVCCRUDProduct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public ModelAndView sayHello() {
		String msg="Hello World!!";
		return new ModelAndView("hello","msg",msg);
		
	}

}
