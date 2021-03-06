package com.slc.XProject.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.slc.XProject.entity.PlayerValues;

public interface PlayerValuesMapper {
    @Delete({
        "delete from player_values",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into player_values (id, player_id, ",
        "type, assists, best_rank_point, ",
        "boosts, dBNOs, damage_dealt, ",
        "daily_kills, daily_wins, ",
        "days, headshot_kills, ",
        "heals, kills, longest_kill, ",
        "longest_time_survived, losses, ",
        "max_kill_streaks, most_survival_time, ",
        "rank_points, revives, ",
        "ride_distance, road_kills, ",
        "round_most_kills, rounds_played, ",
        "suicides, swim_distance, ",
        "team_kills, time_survived, ",
        "top10s, vehicle_destroys, ",
        "walk_distance, weapons_acquired, ",
        "weekly_kills, weekly_wins, ",
        "wins,seasons_id)",
        "values (#{id,jdbcType=BIGINT}, #{playerId,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=INTEGER}, #{assists,jdbcType=VARCHAR}, #{bestRankPoint,jdbcType=VARCHAR}, ",
        "#{boosts,jdbcType=VARCHAR}, #{dBNOs,jdbcType=VARCHAR}, #{damageDealt,jdbcType=VARCHAR}, ",
        "#{dailyKills,jdbcType=VARCHAR}, #{dailyWins,jdbcType=VARCHAR}, ",
        "#{days,jdbcType=VARCHAR}, #{headshotKills,jdbcType=VARCHAR}, ",
        "#{heals,jdbcType=VARCHAR}, #{kills,jdbcType=VARCHAR}, #{longestKill,jdbcType=VARCHAR}, ",
        "#{longestTimeSurvived,jdbcType=VARCHAR}, #{losses,jdbcType=VARCHAR}, ",
        "#{maxKillStreaks,jdbcType=VARCHAR}, #{mostSurvivalTime,jdbcType=VARCHAR}, ",
        "#{rankPoints,jdbcType=VARCHAR}, #{revives,jdbcType=VARCHAR}, ",
        "#{rideDistance,jdbcType=VARCHAR}, #{roadKills,jdbcType=VARCHAR}, ",
        "#{roundMostKills,jdbcType=VARCHAR}, #{roundsPlayed,jdbcType=VARCHAR}, ",
        "#{suicides,jdbcType=VARCHAR}, #{swimDistance,jdbcType=VARCHAR}, ",
        "#{teamKills,jdbcType=VARCHAR}, #{timeSurvived,jdbcType=VARCHAR}, ",
        "#{top10s,jdbcType=VARCHAR}, #{vehicleDestroys,jdbcType=VARCHAR}, ",
        "#{walkDistance,jdbcType=VARCHAR}, #{weaponsAcquired,jdbcType=VARCHAR}, ",
        "#{weeklyKills,jdbcType=VARCHAR}, #{weeklyWins,jdbcType=VARCHAR}, ",
        "#{wins,jdbcType=VARCHAR},#{seasonsId,jdbcType=INTEGER})"
    })
    int insert(PlayerValues record);

    @InsertProvider(type=PlayerValuesSqlProvider.class, method="insertSelective")
    int insertSelective(PlayerValues record);

    @Select({
        "select",
        "id, player_id, type, assists, best_rank_point, boosts, dBNOs, damage_dealt, ",
        "daily_kills, daily_wins, days, headshot_kills, heals, kills, longest_kill, longest_time_survived, ",
        "losses, max_kill_streaks, most_survival_time, rank_points, revives, ride_distance, ",
        "road_kills, round_most_kills, rounds_played, suicides, swim_distance, team_kills, ",
        "time_survived, top10s, vehicle_destroys, walk_distance, weapons_acquired, weekly_kills, ",
        "weekly_wins, wins,seasons_id",
        "from player_values",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="player_id", property="playerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="assists", property="assists", jdbcType=JdbcType.VARCHAR),
        @Result(column="best_rank_point", property="bestRankPoint", jdbcType=JdbcType.VARCHAR),
        @Result(column="boosts", property="boosts", jdbcType=JdbcType.VARCHAR),
        @Result(column="dBNOs", property="dBNOs", jdbcType=JdbcType.VARCHAR),
        @Result(column="damage_dealt", property="damageDealt", jdbcType=JdbcType.VARCHAR),
        @Result(column="daily_kills", property="dailyKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="daily_wins", property="dailyWins", jdbcType=JdbcType.VARCHAR),
        @Result(column="days", property="days", jdbcType=JdbcType.VARCHAR),
        @Result(column="headshot_kills", property="headshotKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="heals", property="heals", jdbcType=JdbcType.VARCHAR),
        @Result(column="kills", property="kills", jdbcType=JdbcType.VARCHAR),
        @Result(column="longest_kill", property="longestKill", jdbcType=JdbcType.VARCHAR),
        @Result(column="longest_time_survived", property="longestTimeSurvived", jdbcType=JdbcType.VARCHAR),
        @Result(column="losses", property="losses", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_kill_streaks", property="maxKillStreaks", jdbcType=JdbcType.VARCHAR),
        @Result(column="most_survival_time", property="mostSurvivalTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="rank_points", property="rankPoints", jdbcType=JdbcType.VARCHAR),
        @Result(column="revives", property="revives", jdbcType=JdbcType.VARCHAR),
        @Result(column="ride_distance", property="rideDistance", jdbcType=JdbcType.VARCHAR),
        @Result(column="road_kills", property="roadKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="round_most_kills", property="roundMostKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="rounds_played", property="roundsPlayed", jdbcType=JdbcType.VARCHAR),
        @Result(column="suicides", property="suicides", jdbcType=JdbcType.VARCHAR),
        @Result(column="swim_distance", property="swimDistance", jdbcType=JdbcType.VARCHAR),
        @Result(column="team_kills", property="teamKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_survived", property="timeSurvived", jdbcType=JdbcType.VARCHAR),
        @Result(column="top10s", property="top10s", jdbcType=JdbcType.VARCHAR),
        @Result(column="vehicle_destroys", property="vehicleDestroys", jdbcType=JdbcType.VARCHAR),
        @Result(column="walk_distance", property="walkDistance", jdbcType=JdbcType.VARCHAR),
        @Result(column="weapons_acquired", property="weaponsAcquired", jdbcType=JdbcType.VARCHAR),
        @Result(column="weekly_kills", property="weeklyKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="weekly_wins", property="weeklyWins", jdbcType=JdbcType.VARCHAR),
        @Result(column="wins", property="wins", jdbcType=JdbcType.VARCHAR),
        @Result(column="seasons_id", property="seasonsId", jdbcType=JdbcType.INTEGER)
    })
    PlayerValues selectByPrimaryKey(Long id);

    @Select({
        "select",
        "id, player_id, type, assists, best_rank_point, boosts, dBNOs, damage_dealt, ",
        "daily_kills, daily_wins, days, headshot_kills, heals, kills, longest_kill, longest_time_survived, ",
        "losses, max_kill_streaks, most_survival_time, rank_points, revives, ride_distance, ",
        "road_kills, round_most_kills, rounds_played, suicides, swim_distance, team_kills, ",
        "time_survived, top10s, vehicle_destroys, walk_distance, weapons_acquired, weekly_kills, ",
        "weekly_wins, wins ,seasons_id",
        "from player_values",
        "where player_id = #{playerid,jdbcType=VARCHAR} and type=#{type}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="player_id", property="playerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="assists", property="assists", jdbcType=JdbcType.VARCHAR),
        @Result(column="best_rank_point", property="bestRankPoint", jdbcType=JdbcType.VARCHAR),
        @Result(column="boosts", property="boosts", jdbcType=JdbcType.VARCHAR),
        @Result(column="dBNOs", property="dBNOs", jdbcType=JdbcType.VARCHAR),
        @Result(column="damage_dealt", property="damageDealt", jdbcType=JdbcType.VARCHAR),
        @Result(column="daily_kills", property="dailyKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="daily_wins", property="dailyWins", jdbcType=JdbcType.VARCHAR),
        @Result(column="days", property="days", jdbcType=JdbcType.VARCHAR),
        @Result(column="headshot_kills", property="headshotKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="heals", property="heals", jdbcType=JdbcType.VARCHAR),
        @Result(column="kills", property="kills", jdbcType=JdbcType.VARCHAR),
        @Result(column="longest_kill", property="longestKill", jdbcType=JdbcType.VARCHAR),
        @Result(column="longest_time_survived", property="longestTimeSurvived", jdbcType=JdbcType.VARCHAR),
        @Result(column="losses", property="losses", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_kill_streaks", property="maxKillStreaks", jdbcType=JdbcType.VARCHAR),
        @Result(column="most_survival_time", property="mostSurvivalTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="rank_points", property="rankPoints", jdbcType=JdbcType.VARCHAR),
        @Result(column="revives", property="revives", jdbcType=JdbcType.VARCHAR),
        @Result(column="ride_distance", property="rideDistance", jdbcType=JdbcType.VARCHAR),
        @Result(column="road_kills", property="roadKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="round_most_kills", property="roundMostKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="rounds_played", property="roundsPlayed", jdbcType=JdbcType.VARCHAR),
        @Result(column="suicides", property="suicides", jdbcType=JdbcType.VARCHAR),
        @Result(column="swim_distance", property="swimDistance", jdbcType=JdbcType.VARCHAR),
        @Result(column="team_kills", property="teamKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_survived", property="timeSurvived", jdbcType=JdbcType.VARCHAR),
        @Result(column="top10s", property="top10s", jdbcType=JdbcType.VARCHAR),
        @Result(column="vehicle_destroys", property="vehicleDestroys", jdbcType=JdbcType.VARCHAR),
        @Result(column="walk_distance", property="walkDistance", jdbcType=JdbcType.VARCHAR),
        @Result(column="weapons_acquired", property="weaponsAcquired", jdbcType=JdbcType.VARCHAR),
        @Result(column="weekly_kills", property="weeklyKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="weekly_wins", property="weeklyWins", jdbcType=JdbcType.VARCHAR),
        @Result(column="wins", property="wins", jdbcType=JdbcType.VARCHAR),
        @Result(column="seasons_id", property="seasonsId", jdbcType=JdbcType.INTEGER)
    })
    PlayerValues selectByIdAndType(@Param("playerid")String playerid,@Param("type")int type);
    
    @Select({
    	"SELECT                                                 ",
    	"	player_id,                                          ",
    	"	ROUND(SUM(type)) as type,                                  ",
    	"	ROUND(SUM(assists)) as assists,                            ",
    	"	ROUND(Max(best_rank_point)) as best_rank_point,            ",
    	"	ROUND(SUM(boosts)) as boosts,                              ",
    	"	ROUND(SUM(dBNOs)) as dBNOs,                                ",
    	"	ROUND(SUM(damage_dealt)) as damage_dealt,                  ",
    	"	ROUND(SUM(daily_kills)) as daily_kills,                    ",
    	"	ROUND(SUM(daily_wins)) as daily_wins,                      ",
    	"	ROUND(SUM(days)) as days,                                  ",
    	"	ROUND(SUM(headshot_kills)) as headshot_kills,              ",
    	"	ROUND(SUM(heals)) as heals,                                ",
    	"	ROUND(SUM(kills)) as kills,                                ",
    	"	ROUND(Max(longest_kill)) as longest_kill,                  ",
    	"	ROUND(Max(longest_time_survived)) as longest_time_survived,",
    	"	ROUND(SUM(losses)) as losses,                              ",
    	"	ROUND(Max(max_kill_streaks)) as max_kill_streaks,          ",
    	"	ROUND(Max(most_survival_time)) as most_survival_time,      ",
    	"	ROUND(Max(rank_points)) as rank_points,                    ",
    	"	ROUND(SUM(revives)) as revives,                            ",
    	"	ROUND(SUM(ride_distance)) as ride_distance,                ",
    	"	ROUND(SUM(road_kills)) as road_kills,                      ",
    	"	ROUND(Max(round_most_kills)) as round_most_kills,          ",
    	"	ROUND(SUM(rounds_played)) as rounds_played,                ",
    	"	ROUND(SUM(suicides)) as suicides,                          ",
    	"	ROUND(SUM(swim_distance)) as swim_distance,                ",
    	"	ROUND(SUM(team_kills)) as team_kills,                      ",
    	"	ROUND(SUM(time_survived))as time_survived,                 ",
    	"	ROUND(SUM(top10s)) as top10s,                              ",
    	"	ROUND(SUM(vehicle_destroys)) as vehicle_destroys,          ",
    	"	ROUND(SUM(walk_distance)) as walk_distance,                ",
    	"	ROUND(SUM(weapons_acquired))as weapons_acquired,           ",
    	"	ROUND(SUM(weekly_kills)) as weekly_kills,                  ",
    	"	ROUND(SUM(weekly_wins))as weekly_wins,                     ",
    	"	ROUND(SUM(wins)) as wins                                   ",
    	"FROM                                                   ",
    	"	player_values                                       ",
    	"WHERE                                                  ",
    	"	seasons_id =0                                  ",
    	 "and player_id = #{playerid,jdbcType=VARCHAR} ",
    	"GROUP BY                                               ",
    	"	player_id;                                          "
       
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="player_id", property="playerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="assists", property="assists", jdbcType=JdbcType.VARCHAR),
        @Result(column="best_rank_point", property="bestRankPoint", jdbcType=JdbcType.VARCHAR),
        @Result(column="boosts", property="boosts", jdbcType=JdbcType.VARCHAR),
        @Result(column="dBNOs", property="dBNOs", jdbcType=JdbcType.VARCHAR),
        @Result(column="damage_dealt", property="damageDealt", jdbcType=JdbcType.VARCHAR),
        @Result(column="daily_kills", property="dailyKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="daily_wins", property="dailyWins", jdbcType=JdbcType.VARCHAR),
        @Result(column="days", property="days", jdbcType=JdbcType.VARCHAR),
        @Result(column="headshot_kills", property="headshotKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="heals", property="heals", jdbcType=JdbcType.VARCHAR),
        @Result(column="kills", property="kills", jdbcType=JdbcType.VARCHAR),
        @Result(column="longest_kill", property="longestKill", jdbcType=JdbcType.VARCHAR),
        @Result(column="longest_time_survived", property="longestTimeSurvived", jdbcType=JdbcType.VARCHAR),
        @Result(column="losses", property="losses", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_kill_streaks", property="maxKillStreaks", jdbcType=JdbcType.VARCHAR),
        @Result(column="most_survival_time", property="mostSurvivalTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="rank_points", property="rankPoints", jdbcType=JdbcType.VARCHAR),
        @Result(column="revives", property="revives", jdbcType=JdbcType.VARCHAR),
        @Result(column="ride_distance", property="rideDistance", jdbcType=JdbcType.VARCHAR),
        @Result(column="road_kills", property="roadKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="round_most_kills", property="roundMostKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="rounds_played", property="roundsPlayed", jdbcType=JdbcType.VARCHAR),
        @Result(column="suicides", property="suicides", jdbcType=JdbcType.VARCHAR),
        @Result(column="swim_distance", property="swimDistance", jdbcType=JdbcType.VARCHAR),
        @Result(column="team_kills", property="teamKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_survived", property="timeSurvived", jdbcType=JdbcType.VARCHAR),
        @Result(column="top10s", property="top10s", jdbcType=JdbcType.VARCHAR),
        @Result(column="vehicle_destroys", property="vehicleDestroys", jdbcType=JdbcType.VARCHAR),
        @Result(column="walk_distance", property="walkDistance", jdbcType=JdbcType.VARCHAR),
        @Result(column="weapons_acquired", property="weaponsAcquired", jdbcType=JdbcType.VARCHAR),
        @Result(column="weekly_kills", property="weeklyKills", jdbcType=JdbcType.VARCHAR),
        @Result(column="weekly_wins", property="weeklyWins", jdbcType=JdbcType.VARCHAR),
        @Result(column="wins", property="wins", jdbcType=JdbcType.VARCHAR),
        @Result(column="seasons_id", property="seasonsId", jdbcType=JdbcType.INTEGER)
    })
    PlayerValues selectByPlayerId(@Param("playerid")String playerid);
    
    
    @UpdateProvider(type=PlayerValuesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PlayerValues record);

    @Update({
        "update player_values",
        "set player_id = #{playerId,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=INTEGER},",
          "assists = #{assists,jdbcType=VARCHAR},",
          "best_rank_point = #{bestRankPoint,jdbcType=VARCHAR},",
          "boosts = #{boosts,jdbcType=VARCHAR},",
          "dBNOs = #{dBNOs,jdbcType=VARCHAR},",
          "damage_dealt = #{damageDealt,jdbcType=VARCHAR},",
          "daily_kills = #{dailyKills,jdbcType=VARCHAR},",
          "daily_wins = #{dailyWins,jdbcType=VARCHAR},",
          "days = #{days,jdbcType=VARCHAR},",
          "headshot_kills = #{headshotKills,jdbcType=VARCHAR},",
          "heals = #{heals,jdbcType=VARCHAR},",
          "kills = #{kills,jdbcType=VARCHAR},",
          "longest_kill = #{longestKill,jdbcType=VARCHAR},",
          "longest_time_survived = #{longestTimeSurvived,jdbcType=VARCHAR},",
          "losses = #{losses,jdbcType=VARCHAR},",
          "max_kill_streaks = #{maxKillStreaks,jdbcType=VARCHAR},",
          "most_survival_time = #{mostSurvivalTime,jdbcType=VARCHAR},",
          "rank_points = #{rankPoints,jdbcType=VARCHAR},",
          "revives = #{revives,jdbcType=VARCHAR},",
          "ride_distance = #{rideDistance,jdbcType=VARCHAR},",
          "road_kills = #{roadKills,jdbcType=VARCHAR},",
          "round_most_kills = #{roundMostKills,jdbcType=VARCHAR},",
          "rounds_played = #{roundsPlayed,jdbcType=VARCHAR},",
          "suicides = #{suicides,jdbcType=VARCHAR},",
          "swim_distance = #{swimDistance,jdbcType=VARCHAR},",
          "team_kills = #{teamKills,jdbcType=VARCHAR},",
          "time_survived = #{timeSurvived,jdbcType=VARCHAR},",
          "top10s = #{top10s,jdbcType=VARCHAR},",
          "vehicle_destroys = #{vehicleDestroys,jdbcType=VARCHAR},",
          "walk_distance = #{walkDistance,jdbcType=VARCHAR},",
          "weapons_acquired = #{weaponsAcquired,jdbcType=VARCHAR},",
          "weekly_kills = #{weeklyKills,jdbcType=VARCHAR},",
          "weekly_wins = #{weeklyWins,jdbcType=VARCHAR},",
          "wins = #{wins,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PlayerValues record);
}