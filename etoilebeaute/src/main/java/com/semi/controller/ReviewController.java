package com.semi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.ItemDTO;
import com.semi.dto.ReviewDTO;
import com.semi.service.ItemService;
import com.semi.service.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	ReviewService service;
	
	@RequestMapping("/review")
	public String review(Model model, Integer itemid, String custid) {
		List<ReviewDTO> list = null;
		try {
			list = service.get_itemreview(itemid);
			model.addAttribute("itemid",itemid);
			model.addAttribute("custid",custid);
			model.addAttribute("list",list);
			model.addAttribute("center","review");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "index";
	}
	
	@RequestMapping("/writereview")
	public String writereview(Model model, int itemid, String custid) {
		model.addAttribute("itemid",itemid);
		model.addAttribute("custid",custid);
		model.addAttribute("center","writereview");
		return "index";
	}
	
	@RequestMapping("/registerreview")
	public String registerreview(Model model, String custid, int itemid, String reviewtext, int star, String dsat) {
		ReviewDTO review = new ReviewDTO(0,custid,itemid,reviewtext,star,dsat);
		try {
			service.register(review);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:review?itemid="+itemid;
	}
	
}