package com.semi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.OrderinfoDTO;
import com.semi.dto.OrdermasterDTO;
import com.semi.service.OrderinfoService;

@Controller
public class OrderinfoController {

	@Autowired
	OrderinfoService service;
	
	@RequestMapping("/orderinfo")
	public String review(Model model, Integer orderinfoid) {
		List<OrderinfoDTO> list = null;
		try {
			list = service.orderdetail(orderinfoid);
			model.addAttribute("list", list);
			model.addAttribute("center", "orderinfo");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return "index";
	}
	
	
}
