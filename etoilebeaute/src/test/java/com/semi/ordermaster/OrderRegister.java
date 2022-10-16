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
class OrderRegister {

	@Autowired
	OrdermasterService service;
	
	@Test
	void contextLoads() {
		OrdermasterDTO om = new OrdermasterDTO(1, 1, "hy", null, 13, 10000);
		try {
			service.register(om);
			int r = om.getOrderid();
	           System.out.println(r);
			System.out.print(om);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
