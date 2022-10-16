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
	public String review(Model model, Integer orderid) {
		List<OrderinfoDTO> list = null;
		int total_price = 0;
		try {
			list = service.orderdetail(orderid);
			for(OrderinfoDTO info : list)
				total_price += info.getPrice()*info.getCnt();
			model.addAttribute("list", list);
			model.addAttribute("total_price", total_price);
			model.addAttribute("coupon_name", list.get(0).getCoupon_name());
			model.addAttribute("rate",list.get(0).getRate());
			model.addAttribute("center", "orderinfo");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return "index";
	}
	
	
}
