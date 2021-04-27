package com.tsis.movie.model;

public class RoomVo {
	private int room_id;
	private String room_seats;
	private String room_row;
	private String room_col;
	private String room_movie_time;
	
	public RoomVo(int room_id, String room_seats, String room_row, String room_col, String room_movie_time) {
		this.room_id = room_id;
		this.room_seats = room_seats;
		this.room_row = room_row;
		this.room_col = room_col;
		this.room_movie_time = room_movie_time;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public String getRoom_seats() {
		return room_seats;
	}

	public void setRoom_seats(String room_seats) {
		this.room_seats = room_seats;
	}

	public String getRoom_row() {
		return room_row;
	}

	public void setRoom_row(String room_row) {
		this.room_row = room_row;
	}

	public String getRoom_col() {
		return room_col;
	}

	public void setRoom_col(String room_col) {
		this.room_col = room_col;
	}

	public String getRoom_movie_time() {
		return room_movie_time;
	}

	public void setRoom_movie_time(String room_movie_time) {
		this.room_movie_time = room_movie_time;
	};
	
	
}
