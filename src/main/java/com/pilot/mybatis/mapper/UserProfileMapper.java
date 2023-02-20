package com.pilot.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.pilot.mybatis.vo.Url;

@Mapper
public interface UserProfileMapper {
	
	@Select("SELECT * FROM URL WHERE id=#{id}")
	Url getUserProfile(@Param("id") String id);
	
	@Select("SELECT * FROM URL")
	List<Url> getUserProfileList();
}
