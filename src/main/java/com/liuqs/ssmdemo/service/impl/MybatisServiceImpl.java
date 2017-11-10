package com.liuqs.ssmdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuqs.ssmdemo.dao.MybatisMapper;
import com.liuqs.ssmdemo.service.MybatisService;

@Service
public class MybatisServiceImpl implements MybatisService {

	@Autowired
	private MybatisMapper mybatisMapper;
	
	public List user() {
		List user = mybatisMapper.user();
		return user;
	}

}
