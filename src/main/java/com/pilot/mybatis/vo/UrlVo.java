package com.pilot.mybatis.vo;

public class UrlVo {
	private int id;
	private String shortUrl;
	private String longUrl;
	
	
	public UrlVo(int id, String shortUrl, String longUrl) {
		super();
		this.id = id;
		this.longUrl = longUrl;
		this.shortUrl = shortUrl;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLongUrl() {
		return longUrl;
	}
	public void setLongUrl(String longUrl) {
		this.longUrl = longUrl;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
}
