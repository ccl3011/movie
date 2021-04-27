package com.tsis.movie.model;

import lombok.Data;

@Data
public class MovieVo {
	private int movie_id;
	private String movie_title;
	private String room_movie_time;
	private String movie_price;
	private String room_num;
	
	
	public MovieVo(int movie_id, String movie_title, String room_movie_time, String movie_price, String room_num) {
		this.movie_id = movie_id;
		this.movie_title = movie_title;
		this.room_movie_time = room_movie_time;
		this.movie_price = movie_price;
		this.room_num = room_num;
	}
	
	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	
	public String getMovie_title() {
		return movie_title;
	}


	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}


	public String getRoom_movie_time() {
		return room_movie_time;
	}


	public void setRoom_movie_time(String room_movie_time) {
		this.room_movie_time = room_movie_time;
	}


	public String getMovie_price() {
		return movie_price;
	}


	public void setMovie_price(String movie_price) {
		this.movie_price = movie_price;
	}


	public String getRoom_num() {
		return room_num;
	}


	public void setRoom_num(String room_num) {
		this.room_num = room_num;
	}
	
}
