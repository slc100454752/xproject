package com.slc.XProject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slc.XProject.entity.User;
import com.slc.XProject.service.IUserService;

@RestController
@RequestMapping("xproject/")
public class IndexController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	private @Autowired IUserService userService;

	@RequestMapping("test")
	public String test() {
		try {
			logger.info("test");
			User user = new User();
			user.setLoginMobile("15527770352");
			user.setPassword("asdasd");
			userService.insertUser(user);
		} catch (Exception e) {
			logger.error("异常{}",e);
		}

		return "xproject";
	}

	@RequestMapping("test1")
	public String test1() {
		
		return userService.selectUserByLoginMobile("15527770352").toString();
	}
}
