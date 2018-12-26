package com.slc.XProject.mapper;

import org.apache.ibatis.jdbc.SQL;

import com.slc.XProject.entity.PlayerValues;

public class PlayerValuesSqlProvider {

    public String insertSelective(PlayerValues record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("player_values");
        
        if (record.getId() != 0) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getPlayerId() != null) {
            sql.VALUES("player_id", "#{playerId,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != 0) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getAssists() != 0) {
            sql.VALUES("assists", "#{assists,jdbcType=VARCHAR}");
        }
        
        if (record.getBestRankPoint() != 0) {
            sql.VALUES("best_rank_point", "#{bestRankPoint,jdbcType=VARCHAR}");
        }
        
        if (record.getBoosts() != 0) {
            sql.VALUES("boosts", "#{boosts,jdbcType=VARCHAR}");
        }
        
        if (record.getdBNOs() != 0) {
            sql.VALUES("dBNOs", "#{dBNOs,jdbcType=VARCHAR}");
        }
        
        if (record.getDamageDealt() != 0) {
            sql.VALUES("damage_dealt", "#{damageDealt,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyKills() != 0) {
            sql.VALUES("daily_kills", "#{dailyKills,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyWins() != 0) {
            sql.VALUES("daily_wins", "#{dailyWins,jdbcType=VARCHAR}");
        }
        
        if (record.getDays() != 0) {
            sql.VALUES("days", "#{days,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadshotKills() != 0) {
            sql.VALUES("headshot_kills", "#{headshotKills,jdbcType=VARCHAR}");
        }
        
        if (record.getHeals() != 0) {
            sql.VALUES("heals", "#{heals,jdbcType=VARCHAR}");
        }
        
        if (record.getKills() != 0) {
            sql.VALUES("kills", "#{kills,jdbcType=VARCHAR}");
        }
        
        if (record.getLongestKill() != 0) {
            sql.VALUES("longest_kill", "#{longestKill,jdbcType=VARCHAR}");
        }
        
        if (record.getLongestTimeSurvived() != 0) {
            sql.VALUES("longest_time_survived", "#{longestTimeSurvived,jdbcType=VARCHAR}");
        }
        
        if (record.getLosses() != 0) {
            sql.VALUES("losses", "#{losses,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxKillStreaks() != 0) {
            sql.VALUES("max_kill_streaks", "#{maxKillStreaks,jdbcType=VARCHAR}");
        }
        
        if (record.getMostSurvivalTime() != 0) {
            sql.VALUES("most_survival_time", "#{mostSurvivalTime,jdbcType=VARCHAR}");
        }
        
        if (record.getRankPoints() != 0) {
            sql.VALUES("rank_points", "#{rankPoints,jdbcType=VARCHAR}");
        }
        
        if (record.getRevives() != 0) {
            sql.VALUES("revives", "#{revives,jdbcType=VARCHAR}");
        }
        
        if (record.getRideDistance() != 0) {
            sql.VALUES("ride_distance", "#{rideDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getRoadKills() != 0) {
            sql.VALUES("road_kills", "#{roadKills,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundMostKills() != 0) {
            sql.VALUES("round_most_kills", "#{roundMostKills,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundsPlayed() != 0) {
            sql.VALUES("rounds_played", "#{roundsPlayed,jdbcType=VARCHAR}");
        }
        
        if (record.getSuicides() != 0) {
            sql.VALUES("suicides", "#{suicides,jdbcType=VARCHAR}");
        }
        
        if (record.getSwimDistance() != 0) {
            sql.VALUES("swim_distance", "#{swimDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamKills() != 0) {
            sql.VALUES("team_kills", "#{teamKills,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeSurvived() != 0) {
            sql.VALUES("time_survived", "#{timeSurvived,jdbcType=VARCHAR}");
        }
        
        if (record.getTop10s() != 0) {
            sql.VALUES("top10s", "#{top10s,jdbcType=VARCHAR}");
        }
        
        if (record.getVehicleDestroys() != 0) {
            sql.VALUES("vehicle_destroys", "#{vehicleDestroys,jdbcType=VARCHAR}");
        }
        
        if (record.getWalkDistance() != 0) {
            sql.VALUES("walk_distance", "#{walkDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getWeaponsAcquired() != 0) {
            sql.VALUES("weapons_acquired", "#{weaponsAcquired,jdbcType=VARCHAR}");
        }
        
        if (record.getWeeklyKills() != 0) {
            sql.VALUES("weekly_kills", "#{weeklyKills,jdbcType=VARCHAR}");
        }
        
        if (record.getWeeklyWins() != 0) {
            sql.VALUES("weekly_wins", "#{weeklyWins,jdbcType=VARCHAR}");
        }
        
        if (record.getWins() != 0) {
            sql.VALUES("wins", "#{wins,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PlayerValues record) {
        SQL sql = new SQL();
        sql.UPDATE("player_values");
        
        if (record.getPlayerId() != null) {
            sql.SET("player_id = #{playerId,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != 0) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getAssists() != 0) {
            sql.SET("assists = #{assists,jdbcType=VARCHAR}");
        }
        
        if (record.getBestRankPoint() != 0) {
            sql.SET("best_rank_point = #{bestRankPoint,jdbcType=VARCHAR}");
        }
        
        if (record.getBoosts() != 0) {
            sql.SET("boosts = #{boosts,jdbcType=VARCHAR}");
        }
        
        if (record.getdBNOs() != 0) {
            sql.SET("dBNOs = #{dBNOs,jdbcType=VARCHAR}");
        }
        
        if (record.getDamageDealt() != 0) {
            sql.SET("damage_dealt = #{damageDealt,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyKills() != 0) {
            sql.SET("daily_kills = #{dailyKills,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyWins() != 0) {
            sql.SET("daily_wins = #{dailyWins,jdbcType=VARCHAR}");
        }
        
        if (record.getDays() != 0) {
            sql.SET("days = #{days,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadshotKills() != 0) {
            sql.SET("headshot_kills = #{headshotKills,jdbcType=VARCHAR}");
        }
        
        if (record.getHeals() != 0) {
            sql.SET("heals = #{heals,jdbcType=VARCHAR}");
        }
        
        if (record.getKills() != 0) {
            sql.SET("kills = #{kills,jdbcType=VARCHAR}");
        }
        
        if (record.getLongestKill() != 0) {
            sql.SET("longest_kill = #{longestKill,jdbcType=VARCHAR}");
        }
        
        if (record.getLongestTimeSurvived() != 0) {
            sql.SET("longest_time_survived = #{longestTimeSurvived,jdbcType=VARCHAR}");
        }
        
        if (record.getLosses() != 0) {
            sql.SET("losses = #{losses,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxKillStreaks() != 0) {
            sql.SET("max_kill_streaks = #{maxKillStreaks,jdbcType=VARCHAR}");
        }
        
        if (record.getMostSurvivalTime() != 0) {
            sql.SET("most_survival_time = #{mostSurvivalTime,jdbcType=VARCHAR}");
        }
        
        if (record.getRankPoints() != 0) {
            sql.SET("rank_points = #{rankPoints,jdbcType=VARCHAR}");
        }
        
        if (record.getRevives() != 0) {
            sql.SET("revives = #{revives,jdbcType=VARCHAR}");
        }
        
        if (record.getRideDistance() != 0) {
            sql.SET("ride_distance = #{rideDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getRoadKills() != 0) {
            sql.SET("road_kills = #{roadKills,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundMostKills() != 0) {
            sql.SET("round_most_kills = #{roundMostKills,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundsPlayed() != 0) {
            sql.SET("rounds_played = #{roundsPlayed,jdbcType=VARCHAR}");
        }
        
        if (record.getSuicides() != 0) {
            sql.SET("suicides = #{suicides,jdbcType=VARCHAR}");
        }
        
        if (record.getSwimDistance() != 0) {
            sql.SET("swim_distance = #{swimDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamKills() != 0) {
            sql.SET("team_kills = #{teamKills,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeSurvived() != 0) {
            sql.SET("time_survived = #{timeSurvived,jdbcType=VARCHAR}");
        }
        
        if (record.getTop10s() != 0) {
            sql.SET("top10s = #{top10s,jdbcType=VARCHAR}");
        }
        
        if (record.getVehicleDestroys() != 0) {
            sql.SET("vehicle_destroys = #{vehicleDestroys,jdbcType=VARCHAR}");
        }
        
        if (record.getWalkDistance() != 0) {
            sql.SET("walk_distance = #{walkDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getWeaponsAcquired() != 0) {
            sql.SET("weapons_acquired = #{weaponsAcquired,jdbcType=VARCHAR}");
        }
        
        if (record.getWeeklyKills() != 0) {
            sql.SET("weekly_kills = #{weeklyKills,jdbcType=VARCHAR}");
        }
        
        if (record.getWeeklyWins() != 0) {
            sql.SET("weekly_wins = #{weeklyWins,jdbcType=VARCHAR}");
        }
        
        if (record.getWins() != 0) {
            sql.SET("wins = #{wins,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}