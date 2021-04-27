package com.tsis.movie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tsis.movie.model.BookingVo;
import com.tsis.movie.model.MovieVo;
import com.tsis.movie.model.RoomVo;

@Mapper
public interface MovieMapper {

	//@Select("SELECT * FROM tsis_movie.movie")
	//List<MovieVo_back> getMovieList();
	
	@Select("SELECT movie.movie_id, movie.movie_title, room.room_movie_time, room.room_num, movie.movie_price\r\n"
			+ "FROM tsis_movie.movie movie, tsis_movie.room room \r\n"
			+ "WHERE movie.room_room_id=room.room_id;")
	List<MovieVo> getMovieList();
	
	
	@Select("SELECT room_id, room_seats, room_row, room_col, room_movie_time\r\n"
			+ "FROM tsis_movie.room\r\n"
			+ "WHERE room_num=#{room_num} and room_movie_time=#{room_movie_time}")
	RoomVo getRoomByNumNTime(@Param("room_num") String room_num, @Param("room_movie_time") String room_movie_time);

	@Insert("INSERT INTO tsis_movie.booking(booking_hp,booking_ppl,booking_seat,booking_total_price,movie_movie_id,room_room_id) \r\n"
			+ "VALUES (#{booking_hp},#{booking_ppl},#{booking_seat},#{booking_total_price},#{movie_movie_id},#{room_room_id})")
	int insertBooking(@Param("booking_hp") String booking_hp, @Param("booking_ppl") String booking_ppl, @Param("booking_seat") String booking_seat, 
			@Param("booking_total_price") String booking_total_price, @Param("movie_movie_id") int movie_movie_id, @Param("room_room_id") int room_room_id);

	@Select("SELECT booking_hp, booking_ppl, booking_seat, booking_total_price, movie_title, movie_price, room_num, room_movie_time\r\n"
			+ "FROM tsis_movie.booking booking, tsis_movie.movie movie, tsis_movie.room room\r\n"
			+ "WHERE booking.movie_movie_id = movie.movie_id and booking.room_room_id = room.room_id and booking_hp=#{booking_hp}")
	List<BookingVo> getBookingList(@Param("booking_hp") String booking_hp);
	
	

}
