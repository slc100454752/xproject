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
	public static void main(String[] args) {
		/**
		 * String key="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlMTdiMWJjMC1lNTgzLTAxMzYtOGM5Mi0zYmRiNzM0ZmMxZDEiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNTQ1MjAwMzMyLCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6ImNoaWppcXVlcnkifQ.baoIf1m_hsYLWQpMEjK2L14FnJCNnezUhivDV-ExlHw";
		URL url;
		try {
			url = new URL("https://api.pubg.com/shards/steam/players?filter[playerNames]=ninerjiesiganma");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Authorization","Bearer "+key);
			conn.setRequestProperty("Accept", "application/vnd.api+json");

		 */
		String key="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlMTdiMWJjMC1lNTgzLTAxMzYtOGM5Mi0zYmRiNzM0ZmMxZDEiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNTQ1MjAwMzMyLCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6ImNoaWppcXVlcnkifQ.baoIf1m_hsYLWQpMEjK2L14FnJCNnezUhivDV-ExlHw";
		String url = "https://api.pubg.com/shards/steam/players/account.3a9fe5ddc18341c591ecc1f665f3d419/seasons/lifetime";
		OkHttpClient okHttpClient = new OkHttpClient();
		Request request = new Request.Builder()
		    .url(url)
		    .header("Authorization", "Bearer "+key)
		    .header("Accept", "application/vnd.api+json")
		    .build();
		Call call = okHttpClient.newCall(request);
		try {
		    Response response = call.execute();
		    System.out.println(response.body().string());
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}
}
