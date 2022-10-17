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
class BestItem {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		List<ItemDTO> list = null;
		try {
			list = service.bestitem();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(ItemDTO i:list) {
			System.out.println(i);
		}
		
	}

}




