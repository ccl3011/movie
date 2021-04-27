package com.tsis.movie.model;

public class BookingVo {

	private String booking_hp;
	private String booking_ppl;
	private String booking_seat; 
	private String booking_total_price; 
	private String movie_title; 
	private String movie_price; 
	private String room_num; 
	private String room_movie_time;
	
	public BookingVo(String booking_hp, String booking_ppl, String booking_seat, String booking_total_price,
			String movie_title, String movie_price, String room_num, String room_movie_time) {
		super();
		this.booking_hp = booking_hp;
		this.booking_ppl = booking_ppl;
		this.booking_seat = booking_seat;
		this.booking_total_price = booking_total_price;
		this.movie_title = movie_title;
		this.movie_price = movie_price;
		this.room_num = room_num;
		this.room_movie_time = room_movie_time;
	}

	public String getBooking_hp() {
		return booking_hp;
	}

	public void setBooking_hp(String booking_hp) {
		this.booking_hp = booking_hp;
	}

	public String getBooking_ppl() {
		return booking_ppl;
	}

	public void setBooking_ppl(String booking_ppl) {
		this.booking_ppl = booking_ppl;
	}

	public String getBooking_seat() {
		return booking_seat;
	}

	public void setBooking_seat(String booking_seat) {
		this.booking_seat = booking_seat;
	}

	public String getBooking_total_price() {
		return booking_total_price;
	}

	public void setBooking_total_price(String booking_total_price) {
		this.booking_total_price = booking_total_price;
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

	public String getRoom_num() {
		return room_num;
	}

	public void setRoom_num(String room_num) {
		this.room_num = room_num;
	}

	public String getRoom_movie_time() {
		return room_movie_time;
	}

	public void setRoom_movie_time(String room_movie_time) {
		this.room_movie_time = room_movie_time;
	}
	
	
}
