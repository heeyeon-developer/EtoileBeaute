package com.semi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.OrdermasterDTO;
import com.semi.service.OrdermasterService;

@Controller
public class OrdermasterController {

	@Autowired
	OrdermasterService service;
	
	@RequestMapping("/ordermaster")
	public String review(Model model, String custid) {
		List<OrdermasterDTO> list = null;
		try {
			list = service.orderlist(custid);
			model.addAttribute("list", list);
			model.addAttribute("center", "ordermaster");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return "index";
	}
	
	
}
