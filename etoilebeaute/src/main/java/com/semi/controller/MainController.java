package com.semi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.CustDTO;
import com.semi.dto.ItemDTO;
import com.semi.service.CustService;
import com.semi.service.ItemService;

@Controller
public class MainController {

	@Autowired
	CustService service;
	
	@Autowired
	ItemService item_service;

	@RequestMapping("/shop")
	public String shop(Model model) {
		List<ItemDTO> list = null;
		try {
			list = item_service.getall();
			model.addAttribute("shoplist", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}

	@RequestMapping("/cart")
	public String cart(Model model) {
		model.addAttribute("center", "cart");
		return "index";
	}

	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("center", "login");
		return "index";
	}

	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		if (session != null) {
			session.invalidate();
		}
		return "index";
	}

	@RequestMapping("/loginimpl")
	public String loginimpl(HttpSession session, String id, String pwd, Model model) {
		CustDTO cust = null;
		System.out.println("in");
		try {
			cust = service.get(id);
			if(cust != null) {
				if(cust.getPwd().equals(pwd)) {	
				session.setAttribute("logincust", cust);
				model.addAttribute("center", "maincenter");
				System.out.println("in");
				}
			}
		} catch (Exception e) {
			
		}
		return "index";
	}
	
	
}