package com.liuqs.ssmdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试spring和Springmvc是否整合成功
 */
@Controller
@RequestMapping("/springmvc")
public class SpringMVCController {
	
	@RequestMapping("")
	public String  execute() throws Exception{
		return "testspringmvc";
	}
}
