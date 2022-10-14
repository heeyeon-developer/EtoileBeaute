package com.semi.pay;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.PayDTO;
import com.semi.service.PayService;

@SpringBootTest
class PayTest {

	@Autowired
	PayService service;
	
	@Test
	void contextLoads() {
		PayDTO pay = null;
		try {
			pay = service.get(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println(pay);
	
	}

}
