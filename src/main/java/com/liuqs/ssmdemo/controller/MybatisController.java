package com.liuqs.ssmdemo.controller;

import java.util.Iterator;
import java.util.List;

import com.liuqs.ssmdemo.pojo.Blog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liuqs.ssmdemo.service.MybatisService;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试SSM是否整合成功
 */
@Controller
@RequestMapping("mapper")
public class MybatisController {

    private static Logger logger = LoggerFactory.getLogger(MybatisController.class);

	@Autowired
	private MybatisService mybatisService;

	@RequestMapping(value = "", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String fn1() {
		List<Blog> list = mybatisService.queryAllBlog();
		Iterator<Blog> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		return "查询blog成功";
	}
}
