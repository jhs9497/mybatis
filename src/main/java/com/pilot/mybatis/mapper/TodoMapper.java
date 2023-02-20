package com.pilot.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.pilot.mybatis.vo.Url;

@Mapper
public interface TodoMapper {
	void save(@Param("url") Url url);
}
