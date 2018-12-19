package com.slc.XProject.mapper;

import org.apache.ibatis.jdbc.SQL;

import com.slc.XProject.entity.Player;

public class PlayerSqlProvider {

    public String insertSelective(Player record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("player");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Player record) {
        SQL sql = new SQL();
        sql.UPDATE("player");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}