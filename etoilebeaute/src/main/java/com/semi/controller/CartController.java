package com.semi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.CartDTO;
import com.semi.service.CartService;

@Controller
public class CartController {

	@Autowired
	CartService service;
	
	@RequestMapping("/cart")
	public String cart(Model model, String custid) {
		List<CartDTO> list = null;
		
		try {
			list = service.get_cartitem(custid);
			model.addAttribute("list",list);
			model.addAttribute("center","cart");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "index";
	}	
	
	
	@RequestMapping("addcart")
	public Object addcart(String custid, int itemid, int cnt) {
		String result = "";
		CartDTO cart = new CartDTO(0,itemid,custid,cnt,"","","","",0);
		System.out.println(cart);
		try {
			service.register(cart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}	
}
