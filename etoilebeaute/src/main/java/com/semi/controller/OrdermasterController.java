package com.semi.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.CartDTO;
import com.semi.dto.CustDTO;
import com.semi.dto.ItemDTO;
import com.semi.dto.OrderinfoDTO;
import com.semi.dto.OrdermasterDTO;
import com.semi.service.CartService;
import com.semi.service.CustService;
import com.semi.service.ItemService;
import com.semi.service.OrderinfoService;
import com.semi.service.OrdermasterService;

@Controller
public class OrdermasterController {

	@Autowired
	OrdermasterService service;
	@Autowired
	OrderinfoService orderinfo_service;
	@Autowired
	CartService cart_service;
	@Autowired
	CustService cust_service;
	@Autowired
	ItemService item_service;
	
	@RequestMapping("/ordermaster")
	public String review(Model model, String custid) {
		int total_cnt=0, total_price=0, orderid = 0;
		List<CartDTO> clist = cart_service.get_cartitem(custid);
		
		try {
			for(CartDTO c: clist) {
				total_cnt += c.getCnt();
				ItemDTO item = item_service.get(c.getItemid());
				item_service.modify(new ItemDTO(c.getItemid(),item.getCateid(),item.getName(),item.getPrice(),item.getImg(),new Date(),(item.getStock() - c.getCnt()),item.getDetail_img(),0));
				total_price += c.getItemprice()*c.getCnt();
			}  
			//먼저 ordermaster에 데이터를 저장하고
			OrdermasterDTO om = new OrdermasterDTO(1, 1, custid, null, total_cnt, total_price);
			service.register(om);
			orderid = om.getOrderid();//저장한 ordermasterid 를 받오고
			//저장한 masterid를 통해서 detail 에 저장하고 마스터 화면으로 가기
			//받아온 ordermasterid 를 이용해서 orderinfotable 에 품목들을 추
			//psid를 받아와야 함..?
			int i=0;
			for(CartDTO c : clist) {
				OrderinfoDTO oi = new OrderinfoDTO(1,orderid,c.getItemid(), 1, c.getCnt(), c.getItemprice(), "", "", "",0, "", 0, 0);
				System.out.println(c);
				orderinfo_service.register(oi);
				cart_service.remove(c.getCartid());
			}
			
			List<OrdermasterDTO> list = service.orderlist(custid);
			
			model.addAttribute("list", list);
			model.addAttribute("custid", custid);
			model.addAttribute("center", "ordermaster");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/orderview")
	public String orderview(Model model, String custid) {
		
		try {			
			List<OrdermasterDTO> list = service.orderlist(custid);
			
			
			model.addAttribute("list", list);
			model.addAttribute("custid", custid);
			model.addAttribute("center", "ordermaster");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return "index";
	}
	
	
}
