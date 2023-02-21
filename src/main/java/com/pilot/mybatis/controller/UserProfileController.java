//package com.pilot.mybatis.controller;
//
//import java.util.*;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.pilot.mybatis.mapper.UserProfileMapper;
//import com.pilot.mybatis.vo.Url;
//
//@RestController
//public class UserProfileController {
//	
//	private UserProfileMapper mapper;
//	
//	public UserProfileController(UserProfileMapper mapper) {
//		this.mapper = mapper;
//	}
//	
//	private Map<String, Url> urlMap;
//	
//	@PostConstruct
//	public void init() {
//		urlMap = new HashMap<String, Url>();
//		urlMap.put("1", new Url(1, "short", "www.naver.com"));
//	}
//	
//	
//	@GetMapping("/url/{id}")
//	public Url getUserProfile(@PathVariable("id") String id) {
//		return mapper.getUserProfile(id);
//	}
//	
//	@GetMapping("/url/all")
//	public List<Url> getUserProfileLst() {
//		return mapper.getUserProfileList();
//	}
//	
//	@PostMapping("/url")
//	public void postUrl(@RequestParam("id") int id, @RequestParam("shorturl") String shorturl, @RequestParam("longurl") String longurl) {
//		Url url = new Url(id, longurl, shorturl);
//		url.setId(id);
//		url.setLongUrl(longurl);
//		url.setShortUrl(shorturl);
//	}
//}
