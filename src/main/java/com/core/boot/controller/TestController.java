package com.core.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {
	
	@RequestMapping("/test")
	public String test() {
		int a = 15;
		int b = 19;
		return "hello world"+(a+b);
	}
}
