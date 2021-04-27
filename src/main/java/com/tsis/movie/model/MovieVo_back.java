package com.tsis.movie.model;

public class MovieVo_back {
	private int movie_id;
	private String movie_title;
	private String movie_price;
	private int room_room_id;
	
	public MovieVo_back(int movie_id, String movie_title, String movie_price, int room_room_id) {
		this.movie_id = movie_id;
		this.movie_title = movie_title;
		this.movie_price = movie_price;
		this.room_room_id = room_room_id;
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
	public String getMovie_price() {
		return movie_price;
	}
	public void setMovie_price(String movie_price) {
		this.movie_price = movie_price;
	}
	public int getRoom_room_id() {
		return room_room_id;
	}
	public void setRoom_room_id(int room_room_id) {
		this.room_room_id = room_room_id;
	}
	

}
