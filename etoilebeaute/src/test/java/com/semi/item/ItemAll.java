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
class ItemAll {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(101);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(ItemDTO c:list) {
			System.out.println(c);
		}
		
	}

}




