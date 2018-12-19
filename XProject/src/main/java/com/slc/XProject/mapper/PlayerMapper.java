package com.slc.XProject.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.slc.XProject.entity.Player;

public interface PlayerMapper {
    @Delete({
        "delete from player",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into player (id, name)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR})"
    })
    int insert(Player record);

    @InsertProvider(type=PlayerSqlProvider.class, method="insertSelective")
    int insertSelective(Player record);

    @Select({
        "select",
        "id, name",
        "from player",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    Player selectByPrimaryKey(String id);
    
    @Select({
        "select",
        "id, name",
        "from player",
        "where name = #{name,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    Player selectByName(String name);

    @UpdateProvider(type=PlayerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Player record);

    @Update({
        "update player",
        "set name = #{name,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Player record);
}