package com.semi.ordermaster;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.CustDTO;
import com.semi.dto.ItemDTO;
import com.semi.dto.OrdermasterDTO;
import com.semi.dto.QuestDTO;
import com.semi.service.CustService;
import com.semi.service.ItemService;
import com.semi.service.OrdermasterService;

@SpringBootTest
class GetOrder {

	@Autowired
	OrdermasterService service;
	
	@Test
	void contextLoads() {
		OrdermasterDTO order = null;
		try {
			order = service.get(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(order);
	
	}

}
