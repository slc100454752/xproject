package com.slc.XProject.utils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtils {
	public static String sendHttp(String url) throws IOException {
		String key = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlMTdiMWJjMC1lNTgzLTAxMzYtOGM5Mi0zYmRiNzM0ZmMxZDEiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNTQ1MjAwMzMyLCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6ImNoaWppcXVlcnkifQ.baoIf1m_hsYLWQpMEjK2L14FnJCNnezUhivDV-ExlHw";
		//String url = "https://api.pubg.com/shards/steam/players/account.3a9fe5ddc18341c591ecc1f665f3d419/seasons/lifetime";
		OkHttpClient okHttpClient = new OkHttpClient();
		Request request = new Request.Builder().url(url).header("Authorization", "Bearer " + key)
				.header("Accept", "application/vnd.api+json").build();
		Call call = okHttpClient.newCall(request);

		Response response = call.execute();

		return response.body().string();

	}
}
