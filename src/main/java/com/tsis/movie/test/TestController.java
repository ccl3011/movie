package com.tsis.movie.test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private TestMapper mapper;

	public TestController(TestMapper mapper) {
		this.mapper = mapper;
	}

	@PutMapping("/user/{hp}")
	public void putUser(@PathVariable("hp") String hp) {
		mapper.insertUser(hp);
	}
	
}
