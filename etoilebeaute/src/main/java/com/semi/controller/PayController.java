package com.semi.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.CartDTO;
import com.semi.dto.CustDTO;
import com.semi.dto.OrdermasterDTO;
import com.semi.dto.PayDTO;
import com.semi.dto.PostDTO;
import com.semi.service.CartService;
import com.semi.service.CustService;
import com.semi.service.OrdermasterService;
import com.semi.service.PayService;
import com.semi.service.PostService;

@Controller
public class PayController {

	@Autowired
	PayService service;
	
	@Autowired
	CartService cart_service;
	
	@Autowired
	CustService cust_service;
	
	@Autowired
	PostService post_service;
	
	@Autowired
	PayService pay_service;
	
	@Autowired
	OrdermasterService order_service;
	
	@RequestMapping("/pay")
	public String main(Model model, String custid) {
		List<CartDTO> list = null;
		CustDTO cust = null;
		PostDTO post = null;
		List<PayDTO> pay = null;
		try {
			cust = cust_service.get(custid);
			list = cart_service.get_cartitem(custid);//ok
			post = post_service.getcustpost(custid);
			pay = pay_service.getpay(custid);
			model.addAttribute("custid",custid);
			model.addAttribute("cust", cust);  
			model.addAttribute("list", list);
			model.addAttribute("post", post);
			model.addAttribute("pay", pay);
			model.addAttribute("center", "pay");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	
//	@RequestMapping("/payment")
//	public String payment(Model model, int payid, String custid) {
//		model.addAttribute("center", "pay");
//		return "index";
//	}
	
	@RequestMapping("/payimpl")
	public String payimpl(Model model, List<CartDTO> list, CustDTO cust) {
		int total_cnt = 0, total_price = 0, masterid = 0;
		System.out.println("in");
//		for(CartDTO c:list) {
//			total_cnt += c.getCnt();
//			total_price += c.getItemprice() * c.getCnt() ;
//			System.out.println(total_cnt);
//		}
		System.out.println("1");
		OrdermasterDTO om = new OrdermasterDTO(0, 0, cust.getCustid(), null, total_cnt, total_price);
		System.out.println("2");
		
		try {
			order_service.register(om);
			masterid = om.getOrderid();
			System.out.println(masterid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(masterid);
		
		
		
		return "redirect:ordermaster?custid=";
	}

}
