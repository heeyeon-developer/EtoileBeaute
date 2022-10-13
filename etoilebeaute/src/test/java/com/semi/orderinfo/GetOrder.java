package com.semi.orderinfo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.OrderinfoDTO;
import com.semi.service.OrderinfoService;

@SpringBootTest
class GetOrder {

	@Autowired
	OrderinfoService service;
	
	@Test
	void contextLoads() {
		OrderinfoDTO order = null;
		try {
			order = service.get(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(order);
	
	}

}
