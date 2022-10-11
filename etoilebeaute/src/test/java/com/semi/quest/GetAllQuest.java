package com.semi.quest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.QuestDTO;
import com.semi.service.QuestService;

@SpringBootTest
class GetAllQuest {

	@Autowired
	QuestService service;
	
	@Test
	void contextLoads() {
		List<QuestDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(QuestDTO c:list) {
			System.out.println(c);
		}
		
	}

}




