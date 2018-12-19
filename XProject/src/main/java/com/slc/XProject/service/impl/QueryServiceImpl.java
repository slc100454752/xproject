package com.slc.XProject.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slc.XProject.entity.Player;
import com.slc.XProject.entity.PlayerValues;
import com.slc.XProject.mapper.PlayerMapper;
import com.slc.XProject.mapper.PlayerValuesMapper;
import com.slc.XProject.service.IQueryService;

@Service
public class QueryServiceImpl implements IQueryService {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private @Autowired PlayerMapper playerMapper; 
	
	private @Autowired PlayerValuesMapper playerValuesMapper; 
	
	
	@Override
	public int insertPlayerInfo(Player player) {
		
		return playerMapper.insert(player);
	}

	@Override
	public int insertPlayerValues(PlayerValues player) {
		// TODO Auto-generated method stub
		return playerValuesMapper.insert(player);
	}

	@Override
	public Player selectPlayerByName(String name) {
		
		return playerMapper.selectByName(name);
	}
	
}
