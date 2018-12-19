package com.slc.XProject.entity;

public class PlayerValues {
	private Long id;
	private String name;

	private String assists;// 助攻,
	private String bestRankPoint;// 最高分,
	private String boosts;// 使用的增强数

	private String dailyKills;// 4,
	private String dailyWins;// 0,
	private String damageDealt;// 造成的总伤害。注意：减去自己造成的伤害 45257.99,
	private String days;// 26,
	private String headshotKills;// 爆头 67,
	private String heals;// 使用的治疗项目数 520,
	// private String killPoints;// 0,
	private String kills;// 杀敌数 338,
	private String longestKill;// 最远击杀 360.57755,
	private String longestTimeSurvived;// 最长生存时间 单位（秒） 2199.728,
	private String losses;// 188,
	private String maxKillStreaks;// 3,
	private String mostSurvivalTime;// 最长生存时间 单位（秒） 2199.728,
	private String rankPoints;// rank分 2202.5044,

	private String revives;// 救助队友次数 52,
	private String rideDistance;// 驾驶载具行驶总距离单位（米） 318960.3,
	private String roadKills;// 载具击杀 2,
	private String roundMostKills;// 单场最多击杀 8,
	private String roundsPlayed;// 206,
	private String suicides;// 自杀次数 8,
	private String swimDistance;// 游泳总距离 单位（米） 349.67148,
	private String teamKills;// 击杀队友 8,
	private String timeSurvived;// 生存总时长 单位（秒） 217347.97,
	private String top10s;// 前十数 86,
	private String vehicleDestroys;// 摧毁载具 5,
	private String walkDistance;// 步行距离 单位（米） 291228.9,
	private String weaponsAcquired;// 拾取武器 1129,
	private String weeklyKills;// 上周击杀数 4,
	private String weeklyWins;// 上周吃鸡数 0,

	private String wins;// 总吃鸡数 19

	private String playerId;

	private Integer type;

	private String dBNOs;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId == null ? null : playerId.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getAssists() {
		return assists;
	}

	public void setAssists(String assists) {
		this.assists = assists == null ? null : assists.trim();
	}

	public String getBestRankPoint() {
		return bestRankPoint;
	}

	public void setBestRankPoint(String bestRankPoint) {
		this.bestRankPoint = bestRankPoint == null ? null : bestRankPoint.trim();
	}

	public String getBoosts() {
		return boosts;
	}

	public void setBoosts(String boosts) {
		this.boosts = boosts == null ? null : boosts.trim();
	}

	
	public String getdBNOs() {
		return dBNOs;
	}

	public void setdBNOs(String dBNOs) {
		this.dBNOs = dBNOs;
	}

	public String getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(String damageDealt) {
		this.damageDealt = damageDealt == null ? null : damageDealt.trim();
	}

	public String getDailyKills() {
		return dailyKills;
	}

	public void setDailyKills(String dailyKills) {
		this.dailyKills = dailyKills == null ? null : dailyKills.trim();
	}

	public String getDailyWins() {
		return dailyWins;
	}

	public void setDailyWins(String dailyWins) {
		this.dailyWins = dailyWins == null ? null : dailyWins.trim();
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days == null ? null : days.trim();
	}

	public String getHeadshotKills() {
		return headshotKills;
	}

	public void setHeadshotKills(String headshotKills) {
		this.headshotKills = headshotKills == null ? null : headshotKills.trim();
	}

	public String getHeals() {
		return heals;
	}

	public void setHeals(String heals) {
		this.heals = heals == null ? null : heals.trim();
	}

	public String getKills() {
		return kills;
	}

	public void setKills(String kills) {
		this.kills = kills == null ? null : kills.trim();
	}

	public String getLongestKill() {
		return longestKill;
	}

	public void setLongestKill(String longestKill) {
		this.longestKill = longestKill == null ? null : longestKill.trim();
	}

	public String getLongestTimeSurvived() {
		return longestTimeSurvived;
	}

	public void setLongestTimeSurvived(String longestTimeSurvived) {
		this.longestTimeSurvived = longestTimeSurvived == null ? null : longestTimeSurvived.trim();
	}

	public String getLosses() {
		return losses;
	}

	public void setLosses(String losses) {
		this.losses = losses == null ? null : losses.trim();
	}

	public String getMaxKillStreaks() {
		return maxKillStreaks;
	}

	public void setMaxKillStreaks(String maxKillStreaks) {
		this.maxKillStreaks = maxKillStreaks == null ? null : maxKillStreaks.trim();
	}

	public String getMostSurvivalTime() {
		return mostSurvivalTime;
	}

	public void setMostSurvivalTime(String mostSurvivalTime) {
		this.mostSurvivalTime = mostSurvivalTime == null ? null : mostSurvivalTime.trim();
	}

	public String getRankPoints() {
		return rankPoints;
	}

	public void setRankPoints(String rankPoints) {
		this.rankPoints = rankPoints == null ? null : rankPoints.trim();
	}

	public String getRevives() {
		return revives;
	}

	public void setRevives(String revives) {
		this.revives = revives == null ? null : revives.trim();
	}

	public String getRideDistance() {
		return rideDistance;
	}

	public void setRideDistance(String rideDistance) {
		this.rideDistance = rideDistance == null ? null : rideDistance.trim();
	}

	public String getRoadKills() {
		return roadKills;
	}

	public void setRoadKills(String roadKills) {
		this.roadKills = roadKills == null ? null : roadKills.trim();
	}

	public String getRoundMostKills() {
		return roundMostKills;
	}

	public void setRoundMostKills(String roundMostKills) {
		this.roundMostKills = roundMostKills == null ? null : roundMostKills.trim();
	}

	public String getRoundsPlayed() {
		return roundsPlayed;
	}

	public void setRoundsPlayed(String roundsPlayed) {
		this.roundsPlayed = roundsPlayed == null ? null : roundsPlayed.trim();
	}

	public String getSuicides() {
		return suicides;
	}

	public void setSuicides(String suicides) {
		this.suicides = suicides == null ? null : suicides.trim();
	}

	public String getSwimDistance() {
		return swimDistance;
	}

	public void setSwimDistance(String swimDistance) {
		this.swimDistance = swimDistance == null ? null : swimDistance.trim();
	}

	public String getTeamKills() {
		return teamKills;
	}

	public void setTeamKills(String teamKills) {
		this.teamKills = teamKills == null ? null : teamKills.trim();
	}

	public String getTimeSurvived() {
		return timeSurvived;
	}

	public void setTimeSurvived(String timeSurvived) {
		this.timeSurvived = timeSurvived == null ? null : timeSurvived.trim();
	}

	public String getTop10s() {
		return top10s;
	}

	public void setTop10s(String top10s) {
		this.top10s = top10s == null ? null : top10s.trim();
	}

	public String getVehicleDestroys() {
		return vehicleDestroys;
	}

	public void setVehicleDestroys(String vehicleDestroys) {
		this.vehicleDestroys = vehicleDestroys == null ? null : vehicleDestroys.trim();
	}

	public String getWalkDistance() {
		return walkDistance;
	}

	public void setWalkDistance(String walkDistance) {
		this.walkDistance = walkDistance == null ? null : walkDistance.trim();
	}

	public String getWeaponsAcquired() {
		return weaponsAcquired;
	}

	public void setWeaponsAcquired(String weaponsAcquired) {
		this.weaponsAcquired = weaponsAcquired == null ? null : weaponsAcquired.trim();
	}

	public String getWeeklyKills() {
		return weeklyKills;
	}

	public void setWeeklyKills(String weeklyKills) {
		this.weeklyKills = weeklyKills == null ? null : weeklyKills.trim();
	}

	public String getWeeklyWins() {
		return weeklyWins;
	}

	public void setWeeklyWins(String weeklyWins) {
		this.weeklyWins = weeklyWins == null ? null : weeklyWins.trim();
	}

	public String getWins() {
		return wins;
	}

	public void setWins(String wins) {
		this.wins = wins == null ? null : wins.trim();
	}
}