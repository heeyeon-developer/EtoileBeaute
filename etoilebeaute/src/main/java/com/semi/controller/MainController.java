package com.semi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.semi.dto.CustDTO;
import com.semi.service.CustService;

@Controller
public class MainController {

	@Autowired
	CustService service;

	@RequestMapping("/shop")
	public String shop(Model model) {
		model.addAttribute("center", "shop");
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