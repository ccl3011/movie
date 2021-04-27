package com.tsis.movie.controller;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsis.movie.mapper.MovieMapper;
import com.tsis.movie.model.BookingVo;
import com.tsis.movie.model.MovieVo;
import com.tsis.movie.model.RoomVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@CrossOrigin(origins="*")
@RestController
public class MovieController {
	
	private static final Logger _logger = LoggerFactory.getLogger(MovieController.class);
	private MovieMapper mapper;
	
	public MovieController(MovieMapper mapper) {
		this.mapper = mapper;
	}

	@GetMapping("/movie/all")
	public List<MovieVo> getMovieList() {
		_logger.info("getMovieList()");
		List<MovieVo> test = mapper.getMovieList();
//		for(MovieVo temp : test){
//			System.out.println("Movie_id:" + temp.getMovie_title());
//		}
		return mapper.getMovieList();
	}
	
	@PostMapping("/room")
	public RoomVo postRoom(@RequestParam(value="room_num") String room_num, @RequestParam(value="room_movie_time") String room_movie_time) {
		return mapper.getRoomByNumNTime(room_num, room_movie_time);
	}
	
	@PutMapping("/booking")
	public void putBooking(@RequestParam(value="booking_hp") String booking_hp, 
			@RequestParam(value="booking_ppl") String booking_ppl,
			@RequestParam(value="booking_seat") String booking_seat, 
			@RequestParam(value="booking_total_price") String booking_total_price,
			@RequestParam(value="movie_movie_id") int movie_movie_id, 
			@RequestParam(value="room_room_id") int room_room_id) {
		mapper.insertBooking(booking_hp, booking_ppl, booking_seat, booking_total_price, movie_movie_id, room_room_id);
	}
	
	@PostMapping("/confirm")
	public List<BookingVo> postBookingList(@RequestParam(value="booking_hp") String booking_hp){
		return mapper.getBookingList(booking_hp);
	}
}
