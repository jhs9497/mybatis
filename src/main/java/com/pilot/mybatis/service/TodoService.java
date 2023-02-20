package com.pilot.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pilot.mybatis.mapper.TodoMapper;
import com.pilot.mybatis.vo.Url;

@Service
public class TodoService {
	
	
	private TodoMapper todoMapper;
	
	@Autowired
	public TodoService(TodoMapper todoMapper) {
		this.todoMapper = todoMapper;
	}
	
	public void addTodo(Url url) {
		url.setLongUrl("www.naver.com");
		url.setShortUrl("asdf");
		todoMapper.save(url);
	}
}
