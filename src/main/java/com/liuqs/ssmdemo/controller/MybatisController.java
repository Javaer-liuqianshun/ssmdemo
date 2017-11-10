package com.liuqs.ssmdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liuqs.ssmdemo.service.MybatisService;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试SSM是否整合成功
 */
@Controller
@RequestMapping("mybatis")
public class MybatisController {

	@Autowired
	private MybatisService mybatisService;

	@RequestMapping(value = "", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String fn1() {
		List user = mybatisService.user();
		for (Object object : user) {
			System.out.println(object);
		}
		return "SSM Test Success!";
	}
}
