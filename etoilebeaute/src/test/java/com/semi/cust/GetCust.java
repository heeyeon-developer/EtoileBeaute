package com.semi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.CustDTO;
import com.semi.service.CustService;

@SpringBootTest
class GetCust {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		CustDTO cust = null;
		try {
			cust = service.get("KanghoSong");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cust);
	}

}




