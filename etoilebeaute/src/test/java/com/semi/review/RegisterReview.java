package com.semi.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.ReviewDTO;
import com.semi.service.ReviewService;

@SpringBootTest
class RegisterReview {

	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		ReviewDTO review = new ReviewDTO(0,"hy",3,"향이 좋습니다.",70,"예상 보다 일찍 도착했어요.");
		try {
			service.register(review);
			System.out.println(review);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}




