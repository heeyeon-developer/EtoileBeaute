package com.semi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.CartDTO;
import com.semi.dto.CustDTO;
import com.semi.dto.ItemDTO;
import com.semi.dto.PayDTO;
import com.semi.service.CartService;
import com.semi.service.CustService;
import com.semi.service.ItemService;
import com.semi.service.PayService;

@Controller
public class PayController {

	@Autowired
	PayService service;
	
	@Autowired
	CartService cart_service;
	
	@Autowired
	CustService cust_service;
	
	@RequestMapping("/pay")
	public String main(Model model, String custid) {
		List<CartDTO> list = null;
		CustDTO cust = null;
		try {
			cust = cust_service.get(custid);
			list = cart_service.get_cartitem(custid);
			
			model.addAttribute("cust", cust);
			model.addAttribute("list", list);
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
	public String payimpl(Model model, int payid, String custid, int orderid, String custname, int phone, String addr, String detail_addr, int zipcode, String itemname, int cnt, int order_price, int total_price, String img) {
		PayDTO pay = new PayDTO(0, custid, orderid, null, 0, custname, phone, addr, detail_addr, zipcode, itemname, cnt, order_price, total_price, img);
		
		try {
			service.register(pay);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:pay?payid="+payid;
	}

}
