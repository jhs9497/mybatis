package com.pilot.mybatis.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pilot.mybatis.mapper.MybatisMapper;
import com.pilot.mybatis.util.Base62;
import com.pilot.mybatis.vo.UrlVo;

@Service
public class MybatisService {
	
	final String domain = "www.wooribank.com/";
	
	private MybatisMapper mapper;
	
	@Autowired
	private Base62 base62;
	
	@Autowired
	public void TodoService(MybatisMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<UrlVo> getAllUrl() {
		return mapper.getUrlAll();
	}
	
	public boolean setShortUrl(String longUrl) {
		
		// 존재하는 longurl인지 확인
		
		boolean flag = checkDupliUrl(longUrl);
		System.out.println(flag);
		
		if(!flag) {
			return false;
		}
		
		int id = mapper.getTopId();
		id += 1;
		String shortUrl = domain + base62.encode(id);
		mapper.setShortUrl(longUrl, shortUrl);

		return true;
	}
	
	public boolean checkDupliUrl(String longUrl) {
		UrlVo res = mapper.checkDupliUrl(longUrl);
		if (res == null) {
			return true;
		}
		return false;
	}
}
