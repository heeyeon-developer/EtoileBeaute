package com.semi.pay;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.PayDTO;
import com.semi.service.PayService;

@SpringBootTest
class GetPay {

	@Autowired
	PayService service;
	
	@Test
	void contextLoads() {
		List<PayDTO> list = null;
		try {
			list = service.getpay(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(PayDTO p:list) {
			System.out.println(p);
		}
		
	}

}




