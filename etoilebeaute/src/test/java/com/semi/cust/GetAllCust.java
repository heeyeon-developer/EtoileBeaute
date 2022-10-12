package com.semi.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.CustDTO;
import com.semi.dto.QuestDTO;
import com.semi.service.CustService;

@SpringBootTest
class GetAllCust {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		List<CustDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(CustDTO c:list) {
			System.out.println(c);
		}
		
	}

}




