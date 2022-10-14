package com.semi.marker;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.MarkerDTO;
import com.semi.service.MarkerService;

@SpringBootTest
class SelectAllTest{
	
	@Autowired
	MarkerService service;
	
	@Test
	void contextloads() {
		List<MarkerDTO> list = null;
		
		try {
			list = service.getall();
			for(MarkerDTO m : list) {
				System.out.println(m);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
