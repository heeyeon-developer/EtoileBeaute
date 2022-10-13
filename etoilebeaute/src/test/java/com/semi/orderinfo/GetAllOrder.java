package com.semi.orderinfo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.OrderinfoDTO;
import com.semi.service.OrderinfoService;

@SpringBootTest
class GetAllOrder {

	@Autowired
	OrderinfoService service;
	
	@Test
	void contextLoads() {
		List<OrderinfoDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(OrderinfoDTO o:list) {
			System.out.println(o);
		}
		
	}

}

