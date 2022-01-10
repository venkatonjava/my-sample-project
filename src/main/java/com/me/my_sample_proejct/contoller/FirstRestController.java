package com.me.my_sample_proejct.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class FirstRestController {

	@RequestMapping(method = RequestMethod.GET)
	public String helloWorld() {
		
		return "Hello World";
	}
	
	@RequestMapping(value = "hello2", method = RequestMethod.GET)
	public String helloWorld2() {
		
		return "Hello World2";
	}
}
