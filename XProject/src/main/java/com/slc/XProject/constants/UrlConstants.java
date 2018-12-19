package com.slc.XProject.constants;

public class UrlConstants {
	private String name;
	private String playerId;

	/**
	 * 获取玩家姓名、id及近10场游戏记录id
	 */
	private String queryPlayerAndmatches = String
			.format("https://api.pubg.com/shards/steam/players?filter[playerNames]=%s", name);
	/**
	 * 查询玩家各项游戏指数
	 */
	private String queryPlayerValues = String.format("https://api.pubg.com/shards/steam/players/%s/seasons/lifetime",
			playerId);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getQueryPlayerAndmatches() {
		return queryPlayerAndmatches;
	}
	public void setQueryPlayerAndmatches(String queryPlayerAndmatches) {
		this.queryPlayerAndmatches = queryPlayerAndmatches;
	}
	public String getQueryPlayerValues() {
		return queryPlayerValues;
	}
	public void setQueryPlayerValues(String queryPlayerValues) {
		this.queryPlayerValues = queryPlayerValues;
	}

	
}
