package com.slc.XProject.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slc.XProject.entity.User;
import com.slc.XProject.mapper.UserMapper;
import com.slc.XProject.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private @Autowired UserMapper userMapper; 
	
	@Override
	public int insertUser(User user) {
		
		return userMapper.insert(user);
	}

	@Override
	public User selectUserByLoginMobile(String phone) {
		
		return userMapper.selectByLoginMobile(phone);
	}
	
}
