package com.liuqs.ssmdemo.service.impl;

import com.liuqs.ssmdemo.dao.MyBatisDao;
import com.liuqs.ssmdemo.pojo.Blog;
import com.liuqs.ssmdemo.service.MybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MybatisServiceImpl implements MybatisService {

	@Autowired
	private MyBatisDao myBatisDao;

	public List<Blog> queryAllBlog() {
		return myBatisDao.queryAllBlog();
	}

}
