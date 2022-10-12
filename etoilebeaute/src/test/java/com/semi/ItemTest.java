package com.semi;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.ItemDTO;
import com.semi.service.ItemService;

@SpringBootTest
class ItemTest {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(102);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(ItemDTO i:list) {
			System.out.println(i);
		}
		
	}

}
