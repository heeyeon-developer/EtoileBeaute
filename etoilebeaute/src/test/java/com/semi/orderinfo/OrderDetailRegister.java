package com.semi.orderinfo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.OrderinfoDTO;
import com.semi.dto.OrdermasterDTO;
import com.semi.service.OrderinfoService;

@SpringBootTest
class OrderDetailRegister {

	@Autowired
	OrderinfoService service;
	
	@Test
	void contextLoads() {
		OrderinfoDTO oi = new OrderinfoDTO(1,8,33, 1, 2, 15000, "", "", "",0, "", 0, 0);
		try {
			service.register(oi);
			System.out.println(oi);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}

}
