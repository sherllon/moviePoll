package com.bluesoft.sherllon.main;

public class Movie {

	private long id;
	
	private String title;
	
	public Movie(String title) {
		this.title = title;
	}

	public Movie(long id, String title) {
		this.title = title;
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
