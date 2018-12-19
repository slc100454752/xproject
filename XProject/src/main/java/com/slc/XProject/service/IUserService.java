package com.slc.XProject.service;

import com.slc.XProject.entity.User;

public interface IUserService {
	int insertUser(User user);

	User selectUserByLoginMobile(String phone);
}
