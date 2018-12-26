package com.slc.XProject.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slc.XProject.entity.User;
import com.slc.XProject.service.IUserService;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@RestController

public class IndexController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/")
	public String index() {
	
		return "xproject";
	}

	
}
