package com.semi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.CartDTO;
import com.semi.dto.ItemDTO;
import com.semi.dto.ReviewDTO;
import com.semi.service.CartService;
import com.semi.service.ItemService;
import com.semi.service.ReviewService;

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
}
