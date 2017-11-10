package com.liuqs.ssmdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class SpringMVCController {
	
	@Value("${isCheck}")
	private String isCheck;
	
	@RequestMapping("")
	public String  execute() throws Exception{
		System.out.println(isCheck);
		return "testspringmvc";
	}
}
