package com.semi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.CartDTO;
import com.semi.service.CartService;

@SpringBootTest
class RegisterCart {

	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		CartDTO cart = new CartDTO(0,3,"hy",2,"2022-10-13","","","",0);
		try {
			service.register(cart);
			System.out.println(cart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}




