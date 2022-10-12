package com.semi.item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.CustDTO;
import com.semi.dto.ItemDTO;
import com.semi.dto.QuestDTO;
import com.semi.service.CustService;
import com.semi.service.ItemService;

@SpringBootTest
class GetItem {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		ItemDTO item = null;
		try {
			item = service.get(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println(item);
	
	}

}
