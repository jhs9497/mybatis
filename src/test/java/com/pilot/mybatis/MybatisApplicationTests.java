package com.pilot.mybatis;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pilot.mybatis.service.MybatisService;

@SpringBootTest
class MybatisApplicationTests {
	
	@Autowired
	private MybatisService mybatisService;

	@Test
	void insert10000Data() {
		for (long i = 0; i < 22488; i++) {
			String longurl = "www.wooribank.com/" + Long.toString(i + 2000000000);
			mybatisService.setShortUrl(longurl);
		}
	}

}
