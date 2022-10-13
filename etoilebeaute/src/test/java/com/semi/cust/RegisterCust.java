package com.semi.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.CustDTO;
import com.semi.service.CustService;

@SpringBootTest
class RegisterCust {
	
	@Autowired
	CustService service;
	
	@Test
	void contextloads() {
		CustDTO cust = new CustDTO("id02","pwd02","박재형" , "", null, "", "", "1996-11-06");
		
		try {
			service.register(cust);
			System.out.println(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
