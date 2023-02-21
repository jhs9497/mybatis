package com.pilot.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pilot.mybatis.mapper.MybatisMapper;
import com.pilot.mybatis.service.MybatisService;
import com.pilot.mybatis.vo.UrlVo;

@RestController
@CrossOrigin
@RequestMapping("/mybatis")
public class MybatisController {
	
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private MybatisMapper mapper;
	
	@Autowired
	private MybatisService mybatisService;
	
	public MybatisController(MybatisMapper mapper) {
		this.mapper = mapper;
	}
	
	
	@GetMapping("/all")
	public List<UrlVo> getAllUrl() {
		return mybatisService.getAllUrl();
	}
	
	// shortUrl 생성 api
	@PostMapping(value = "/createShortUrl")
	public ResponseEntity<?> createShortUrl(String url) {
		
		boolean flag = mybatisService.setShortUrl(url);
		if (flag) {
			return new ResponseEntity<>(SUCCESS, HttpStatus.CREATED);
		}
		return new ResponseEntity<>(FAIL, HttpStatus.BAD_REQUEST);
	}

}
