package com.slc.XProject.service;

import com.slc.XProject.entity.Player;
import com.slc.XProject.entity.PlayerValues;

public interface IQueryService {
	int insertPlayerInfo(Player player);

	int insertPlayerValues(PlayerValues player);

	Player selectPlayerByName(String name);
	
	PlayerValues selectByIdAndType(String playerId,int type);
	
	int updateValues(PlayerValues player);
	
	PlayerValues selectByPlayerId(String playerId);
}
