package com.slc.XProject.mapper;

import org.apache.ibatis.jdbc.SQL;

import com.slc.XProject.entity.PlayerValues;

public class PlayerValuesSqlProvider {

    public String insertSelective(PlayerValues record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("player_values");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getPlayerId() != null) {
            sql.VALUES("player_id", "#{playerId,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getAssists() != null) {
            sql.VALUES("assists", "#{assists,jdbcType=VARCHAR}");
        }
        
        if (record.getBestRankPoint() != null) {
            sql.VALUES("best_rank_point", "#{bestRankPoint,jdbcType=VARCHAR}");
        }
        
        if (record.getBoosts() != null) {
            sql.VALUES("boosts", "#{boosts,jdbcType=VARCHAR}");
        }
        
        if (record.getdBNOs() != null) {
            sql.VALUES("dBNOs", "#{dbnos,jdbcType=VARCHAR}");
        }
        
        if (record.getDamageDealt() != null) {
            sql.VALUES("damage_dealt", "#{damageDealt,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyKills() != null) {
            sql.VALUES("daily_kills", "#{dailyKills,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyWins() != null) {
            sql.VALUES("daily_wins", "#{dailyWins,jdbcType=VARCHAR}");
        }
        
        if (record.getDays() != null) {
            sql.VALUES("days", "#{days,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadshotKills() != null) {
            sql.VALUES("headshot_kills", "#{headshotKills,jdbcType=VARCHAR}");
        }
        
        if (record.getHeals() != null) {
            sql.VALUES("heals", "#{heals,jdbcType=VARCHAR}");
        }
        
        if (record.getKills() != null) {
            sql.VALUES("kills", "#{kills,jdbcType=VARCHAR}");
        }
        
        if (record.getLongestKill() != null) {
            sql.VALUES("longest_kill", "#{longestKill,jdbcType=VARCHAR}");
        }
        
        if (record.getLongestTimeSurvived() != null) {
            sql.VALUES("longest_time_survived", "#{longestTimeSurvived,jdbcType=VARCHAR}");
        }
        
        if (record.getLosses() != null) {
            sql.VALUES("losses", "#{losses,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxKillStreaks() != null) {
            sql.VALUES("max_kill_streaks", "#{maxKillStreaks,jdbcType=VARCHAR}");
        }
        
        if (record.getMostSurvivalTime() != null) {
            sql.VALUES("most_survival_time", "#{mostSurvivalTime,jdbcType=VARCHAR}");
        }
        
        if (record.getRankPoints() != null) {
            sql.VALUES("rank_points", "#{rankPoints,jdbcType=VARCHAR}");
        }
        
        if (record.getRevives() != null) {
            sql.VALUES("revives", "#{revives,jdbcType=VARCHAR}");
        }
        
        if (record.getRideDistance() != null) {
            sql.VALUES("ride_distance", "#{rideDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getRoadKills() != null) {
            sql.VALUES("road_kills", "#{roadKills,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundMostKills() != null) {
            sql.VALUES("round_most_kills", "#{roundMostKills,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundsPlayed() != null) {
            sql.VALUES("rounds_played", "#{roundsPlayed,jdbcType=VARCHAR}");
        }
        
        if (record.getSuicides() != null) {
            sql.VALUES("suicides", "#{suicides,jdbcType=VARCHAR}");
        }
        
        if (record.getSwimDistance() != null) {
            sql.VALUES("swim_distance", "#{swimDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamKills() != null) {
            sql.VALUES("team_kills", "#{teamKills,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeSurvived() != null) {
            sql.VALUES("time_survived", "#{timeSurvived,jdbcType=VARCHAR}");
        }
        
        if (record.getTop10s() != null) {
            sql.VALUES("top10s", "#{top10s,jdbcType=VARCHAR}");
        }
        
        if (record.getVehicleDestroys() != null) {
            sql.VALUES("vehicle_destroys", "#{vehicleDestroys,jdbcType=VARCHAR}");
        }
        
        if (record.getWalkDistance() != null) {
            sql.VALUES("walk_distance", "#{walkDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getWeaponsAcquired() != null) {
            sql.VALUES("weapons_acquired", "#{weaponsAcquired,jdbcType=VARCHAR}");
        }
        
        if (record.getWeeklyKills() != null) {
            sql.VALUES("weekly_kills", "#{weeklyKills,jdbcType=VARCHAR}");
        }
        
        if (record.getWeeklyWins() != null) {
            sql.VALUES("weekly_wins", "#{weeklyWins,jdbcType=VARCHAR}");
        }
        
        if (record.getWins() != null) {
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
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getAssists() != null) {
            sql.SET("assists = #{assists,jdbcType=VARCHAR}");
        }
        
        if (record.getBestRankPoint() != null) {
            sql.SET("best_rank_point = #{bestRankPoint,jdbcType=VARCHAR}");
        }
        
        if (record.getBoosts() != null) {
            sql.SET("boosts = #{boosts,jdbcType=VARCHAR}");
        }
        
        if (record.getdBNOs() != null) {
            sql.SET("dBNOs = #{dbnos,jdbcType=VARCHAR}");
        }
        
        if (record.getDamageDealt() != null) {
            sql.SET("damage_dealt = #{damageDealt,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyKills() != null) {
            sql.SET("daily_kills = #{dailyKills,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyWins() != null) {
            sql.SET("daily_wins = #{dailyWins,jdbcType=VARCHAR}");
        }
        
        if (record.getDays() != null) {
            sql.SET("days = #{days,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadshotKills() != null) {
            sql.SET("headshot_kills = #{headshotKills,jdbcType=VARCHAR}");
        }
        
        if (record.getHeals() != null) {
            sql.SET("heals = #{heals,jdbcType=VARCHAR}");
        }
        
        if (record.getKills() != null) {
            sql.SET("kills = #{kills,jdbcType=VARCHAR}");
        }
        
        if (record.getLongestKill() != null) {
            sql.SET("longest_kill = #{longestKill,jdbcType=VARCHAR}");
        }
        
        if (record.getLongestTimeSurvived() != null) {
            sql.SET("longest_time_survived = #{longestTimeSurvived,jdbcType=VARCHAR}");
        }
        
        if (record.getLosses() != null) {
            sql.SET("losses = #{losses,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxKillStreaks() != null) {
            sql.SET("max_kill_streaks = #{maxKillStreaks,jdbcType=VARCHAR}");
        }
        
        if (record.getMostSurvivalTime() != null) {
            sql.SET("most_survival_time = #{mostSurvivalTime,jdbcType=VARCHAR}");
        }
        
        if (record.getRankPoints() != null) {
            sql.SET("rank_points = #{rankPoints,jdbcType=VARCHAR}");
        }
        
        if (record.getRevives() != null) {
            sql.SET("revives = #{revives,jdbcType=VARCHAR}");
        }
        
        if (record.getRideDistance() != null) {
            sql.SET("ride_distance = #{rideDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getRoadKills() != null) {
            sql.SET("road_kills = #{roadKills,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundMostKills() != null) {
            sql.SET("round_most_kills = #{roundMostKills,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundsPlayed() != null) {
            sql.SET("rounds_played = #{roundsPlayed,jdbcType=VARCHAR}");
        }
        
        if (record.getSuicides() != null) {
            sql.SET("suicides = #{suicides,jdbcType=VARCHAR}");
        }
        
        if (record.getSwimDistance() != null) {
            sql.SET("swim_distance = #{swimDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getTeamKills() != null) {
            sql.SET("team_kills = #{teamKills,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeSurvived() != null) {
            sql.SET("time_survived = #{timeSurvived,jdbcType=VARCHAR}");
        }
        
        if (record.getTop10s() != null) {
            sql.SET("top10s = #{top10s,jdbcType=VARCHAR}");
        }
        
        if (record.getVehicleDestroys() != null) {
            sql.SET("vehicle_destroys = #{vehicleDestroys,jdbcType=VARCHAR}");
        }
        
        if (record.getWalkDistance() != null) {
            sql.SET("walk_distance = #{walkDistance,jdbcType=VARCHAR}");
        }
        
        if (record.getWeaponsAcquired() != null) {
            sql.SET("weapons_acquired = #{weaponsAcquired,jdbcType=VARCHAR}");
        }
        
        if (record.getWeeklyKills() != null) {
            sql.SET("weekly_kills = #{weeklyKills,jdbcType=VARCHAR}");
        }
        
        if (record.getWeeklyWins() != null) {
            sql.SET("weekly_wins = #{weeklyWins,jdbcType=VARCHAR}");
        }
        
        if (record.getWins() != null) {
            sql.SET("wins = #{wins,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}