package com.slc.XProject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.slc.XProject.constants.UrlConstants;
import com.slc.XProject.entity.Player;
import com.slc.XProject.entity.PlayerValues;
import com.slc.XProject.entity.User;
import com.slc.XProject.service.IQueryService;
import com.slc.XProject.utils.HttpUtils;
import com.slc.XProject.utils.PojoUtils;

@RestController
@RequestMapping("chijiquery/")
public class QueryController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	private @Autowired IQueryService queryService;

	@RequestMapping("queryByName")
	public String queryByName(String name) {
		logger.info(name);
		Player player = new Player();
		PlayerValues v=new PlayerValues();
		UrlConstants url = new UrlConstants();
		String response=null;
		try {
			// 查询的时候先查库里有没有，如果没有 ，请求蓝洞，入库，如果有，检查这个用户的战绩是否有更新，如果有 入库，如果没有，啥都不做
			Player p = queryService.selectPlayerByName(name);
			if (p == null) {
				
				url.setName(name);
				logger.info(url.getQueryPlayerAndmatches());
				response = HttpUtils.sendHttp(url.getQueryPlayerAndmatches());
				try {
					@SuppressWarnings("unchecked")
					List<JSONObject> ss = (List<JSONObject>) JSONObject.parseObject(response).get("data");
					player.setId(ss.get(0).getString("id"));
					player.setName(ss.get(0).getJSONObject("attributes").getString("name"));
					logger.info(queryService.insertPlayerInfo(player) + "");
				} catch (Exception e) {
					logger.error("查询玩家基本信息异常{}", e);
					return "301";
				}

				// 详细数据查询入库
				url.setPlayerId(player.getId());
				response = HttpUtils.sendHttp(url.getQueryPlayerValues());
				JSONObject data = JSONObject.parseObject(response).getJSONObject("data").getJSONObject("attributes")
						.getJSONObject("gameModeStats");
				try {
					String key = null;
					for (int i = 1; i < 7; i++) {
						switch (i) {
						case 1:
							key="solo-fpp";
							break;
						case 2:
							key="solo";
							break;
						case 3:
							key="duo-fpp";
							break;
						case 4:
							key="duo";
							break;
						case 5:
							key="squad-fpp";
							break;
						case 6:
							key="squad";
							break;

						}
						insertOrUpdateValues(data.getObject(key,PlayerValues.class),player.getId(),PlayerValues.class,i);
					}

				} catch (Exception e) {
					logger.error("查询玩家详细信息异常{}", e);
					return "301";
				}

			} else {
				player=p;
			}
			v = queryService.selectByPlayerId(player.getId());
			logger.info("{}   ------{}",v,player.getId());
			v.setName(name);
		} catch (Exception e) {
			logger.error("异常{}", e);
		}

		return JSON.toJSONString(v);
	}

	private void insertOrUpdateValues(PlayerValues o1, String id, Class<PlayerValues> c, int type)
			throws IllegalArgumentException, IllegalAccessException {
		PlayerValues duo = o1;
		duo.setPlayerId(id);
		duo.setType(type);
		PlayerValues oldDuo = queryService.selectByIdAndType(id, type);
		if (oldDuo == null) {
			logger.info(queryService.insertPlayerValues(duo)+"");
		} else {
			if (!PojoUtils.contrastPojo(duo, oldDuo, PlayerValues.class)) {
				logger.info(queryService.updateValues(duo)+"");
			}
		}
	}

	public static void main(String[] args) {
		User a = new User();
		a.setId(1l);
		a.setUserName("123");
		User a1 = new User();
		a1.setId(1l);
		a1.setUserName("123");
		try {
			PojoUtils.contrastPojo(a, a1, User.class);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * String s=
		 * "{\"data\":{\"type\":\"playerSeason\",\"attributes\":{\"gameModeStats\":{\"duo\":{\"assists\":68,\"bestRankPoint\":2116.8428,\"boosts\":461,\"dBNOs\":201,\"dailyKills\":5,\"dailyWins\":0,\"damageDealt\":45840.547,\"days\":27,\"headshotKills\":67,\"heals\":521,\"killPoints\":0,\"kills\":343,\"longestKill\":360.57755,\"longestTimeSurvived\":2199.728,\"losses\":193,\"maxKillStreaks\":3,\"mostSurvivalTime\":2199.728,\"rankPoints\":0,\"rankPointsTitle\":\"\",\"revives\":52,\"rideDistance\":318960.3,\"roadKills\":2,\"roundMostKills\":8,\"roundsPlayed\":211,\"suicides\":8,\"swimDistance\":349.67148,\"teamKills\":8,\"timeSurvived\":219835.33,\"top10s\":86,\"vehicleDestroys\":5,\"walkDistance\":291228.9,\"weaponsAcquired\":1150,\"weeklyKills\":5,\"weeklyWins\":0,\"winPoints\":0,\"wins\":19},\"duo-fpp\":{\"assists\":0,\"bestRankPoint\":0,\"boosts\":0,\"dBNOs\":0,\"dailyKills\":0,\"dailyWins\":0,\"damageDealt\":0,\"days\":0,\"headshotKills\":0,\"heals\":0,\"killPoints\":0,\"kills\":0,\"longestKill\":0,\"longestTimeSurvived\":0,\"losses\":0,\"maxKillStreaks\":0,\"mostSurvivalTime\":0,\"rankPoints\":0,\"rankPointsTitle\":\"\",\"revives\":0,\"rideDistance\":0,\"roadKills\":0,\"roundMostKills\":0,\"roundsPlayed\":0,\"suicides\":0,\"swimDistance\":0,\"teamKills\":0,\"timeSurvived\":0,\"top10s\":0,\"vehicleDestroys\":0,\"walkDistance\":0,\"weaponsAcquired\":0,\"weeklyKills\":0,\"weeklyWins\":0,\"winPoints\":0,\"wins\":0},\"solo\":{\"assists\":1,\"bestRankPoint\":1069.4551,\"boosts\":12,\"dBNOs\":0,\"dailyKills\":3,\"dailyWins\":0,\"damageDealt\":403.07446,\"days\":1,\"headshotKills\":1,\"heals\":5,\"killPoints\":0,\"kills\":3,\"longestKill\":57.19343,\"longestTimeSurvived\":1860.106,\"losses\":3,\"maxKillStreaks\":1,\"mostSurvivalTime\":1860.106,\"rankPoints\":0,\"rankPointsTitle\":\"\",\"revives\":0,\"rideDistance\":0,\"roadKills\":0,\"roundMostKills\":3,\"roundsPlayed\":3,\"suicides\":0,\"swimDistance\":0,\"teamKills\":0,\"timeSurvived\":3402.0498,\"top10s\":1,\"vehicleDestroys\":0,\"walkDistance\":0,\"weaponsAcquired\":19,\"weeklyKills\":3,\"weeklyWins\":0,\"winPoints\":0,\"wins\":0},\"solo-fpp\":{\"assists\":0,\"bestRankPoint\":0,\"boosts\":0,\"dBNOs\":0,\"dailyKills\":0,\"dailyWins\":0,\"damageDealt\":0,\"days\":0,\"headshotKills\":0,\"heals\":0,\"killPoints\":0,\"kills\":0,\"longestKill\":0,\"longestTimeSurvived\":0,\"losses\":0,\"maxKillStreaks\":0,\"mostSurvivalTime\":0,\"rankPoints\":0,\"rankPointsTitle\":\"\",\"revives\":0,\"rideDistance\":0,\"roadKills\":0,\"roundMostKills\":0,\"roundsPlayed\":0,\"suicides\":0,\"swimDistance\":0,\"teamKills\":0,\"timeSurvived\":0,\"top10s\":0,\"vehicleDestroys\":0,\"walkDistance\":0,\"weaponsAcquired\":0,\"weeklyKills\":0,\"weeklyWins\":0,\"winPoints\":0,\"wins\":0},\"squad\":{\"assists\":9,\"bestRankPoint\":1549.0024,\"boosts\":70,\"dBNOs\":54,\"dailyKills\":4,\"dailyWins\":0,\"damageDealt\":8191.605,\"days\":5,\"headshotKills\":9,\"heals\":48,\"killPoints\":0,\"kills\":59,\"longestKill\":160.18222,\"longestTimeSurvived\":1897.729,\"losses\":27,\"maxKillStreaks\":2,\"mostSurvivalTime\":1897.729,\"rankPoints\":1549.0024,\"rankPointsTitle\":\"\",\"revives\":10,\"rideDistance\":23086.742,\"roadKills\":0,\"roundMostKills\":6,\"roundsPlayed\":27,\"suicides\":0,\"swimDistance\":71.73645,\"teamKills\":0,\"timeSurvived\":29360.799,\"top10s\":15,\"vehicleDestroys\":1,\"walkDistance\":41633.39,\"weaponsAcquired\":124,\"weeklyKills\":4,\"weeklyWins\":0,\"winPoints\":0,\"wins\":0},\"squad-fpp\":{\"assists\":0,\"bestRankPoint\":0,\"boosts\":0,\"dBNOs\":0,\"dailyKills\":0,\"dailyWins\":0,\"damageDealt\":0,\"days\":0,\"headshotKills\":0,\"heals\":0,\"killPoints\":0,\"kills\":0,\"longestKill\":0,\"longestTimeSurvived\":0,\"losses\":0,\"maxKillStreaks\":0,\"mostSurvivalTime\":0,\"rankPoints\":0,\"rankPointsTitle\":\"\",\"revives\":0,\"rideDistance\":0,\"roadKills\":0,\"roundMostKills\":0,\"roundsPlayed\":0,\"suicides\":0,\"swimDistance\":0,\"teamKills\":0,\"timeSurvived\":0,\"top10s\":0,\"vehicleDestroys\":0,\"walkDistance\":0,\"weaponsAcquired\":0,\"weeklyKills\":0,\"weeklyWins\":0,\"winPoints\":0,\"wins\":0}}},\"relationships\":{\"matchesDuoFPP\":{\"data\":[]},\"matchesSquad\":{\"data\":[]},\"matchesSquadFPP\":{\"data\":[]},\"season\":{\"data\":{\"type\":\"season\",\"id\":\"lifetime\"}},\"player\":{\"data\":{\"type\":\"player\",\"id\":\"account.3a9fe5ddc18341c591ecc1f665f3d419\"}},\"matchesSolo\":{\"data\":[]},\"matchesSoloFPP\":{\"data\":[]},\"matchesDuo\":{\"data\":[]}}},\"links\":{\"self\":\"https://api.pubg.com/shards/steam/players/account.3a9fe5ddc18341c591ecc1f665f3d419/seasons/lifetime\"},\"meta\":{}}";
		 * PlayerValues v=new PlayerValues();
		 * v=JSONObject.parseObject(s).getJSONObject("data").getJSONObject("attributes")
		 * .getJSONObject("gameModeStats").getObject("duo", PlayerValues.class);
		 * System.out.println(v.getAssists());
		 */
	}
}
