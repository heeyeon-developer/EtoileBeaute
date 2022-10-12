package com.semi.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.CartDTO;
import com.semi.dto.ReviewDTO;
import com.semi.service.CartService;
import com.semi.service.ReviewService;

@SpringBootTest
class GetAllCart {

	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		List<CartDTO> list = null;
		try {
			list = service.get_cartitem("Minsikkk");
			for(CartDTO c : list)
				System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}




