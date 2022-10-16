package com.semi.answer;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.AnswerDTO;
import com.semi.dto.QuestDTO;
import com.semi.service.AnswerService;

@SpringBootTest
class GetAllAnswer {

	@Autowired
	AnswerService service;
	
	@Test
	void contextLoads() {
		List<AnswerDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(AnswerDTO a:list) {
			System.out.println(a);
		}
		
	}

}




