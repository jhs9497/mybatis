package com.pilot.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.pilot.mybatis.vo.UrlVo;

@Mapper
public interface MybatisMapper {
	
	@Select("SELECT * FROM URL WHERE id=#{id}")
	UrlVo getUserProfile(@Param("id") String id);
	
	@Select("SELECT * FROM URL")
	List<UrlVo> getUrlAll();
	
	@Select("SELECT id FROM URL ORDER BY ID DESC LIMIT 1")
	Integer getTopId();
	
	@Insert("INSERT INTO URL (longurl, shorturl) VALUES (#{longurl}, #{shorturl})")
	int setShortUrl(@Param("longurl") String longurl, @Param("shorturl") String shorturl);
	
	@Select("SELECT * FROM URL WHERE longurl=#{longurl} LIMIT 1")
	UrlVo checkDupliUrl(@Param("longurl") String longurl);
}
