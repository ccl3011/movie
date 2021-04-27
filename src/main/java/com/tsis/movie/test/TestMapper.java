package com.tsis.movie.test;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper {
	
	@Insert("INSERT INTO tsis_movie.test(hp) VALUES (#{hp})")
	int insertUser(@Param("hp") String hp);
	
}
