package com.liuqs.ssmdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liuqs.ssmdemo.service.MybatisService;
@Controller
@RequestMapping("mybatis")
public class MybatisController {

	@Autowired
	private MybatisService mybatisService;
	
	@RequestMapping("")
	public void fn1(){
		List user = mybatisService.user();
		for (Object object : user) {
			System.out.println(object);
		}
	}
}
