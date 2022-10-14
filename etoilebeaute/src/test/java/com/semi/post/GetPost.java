package com.semi.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.PostDTO;
import com.semi.service.PostService;

@SpringBootTest
class GetPost {

	@Autowired
	PostService service;
	
	@Test
	void contextLoads() {
		PostDTO post = null;
		try {
			post = service.get(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println(post);
	
	}

}
