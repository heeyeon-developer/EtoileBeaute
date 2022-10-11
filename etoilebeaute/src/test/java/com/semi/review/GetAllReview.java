package com.semi.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.ReviewDTO;
import com.semi.service.ReviewService;

@SpringBootTest
class GetAllReview {

	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		List<ReviewDTO> list = null;
		try {
			list = service.getall();
			System.out.println("review??");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(ReviewDTO c:list) {
			System.out.println(c);
		}
		
	}

}




