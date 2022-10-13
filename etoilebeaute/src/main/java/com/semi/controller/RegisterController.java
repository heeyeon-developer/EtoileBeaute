package com.semi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.CustDTO;
import com.semi.service.CustService;

@Controller
public class RegisterController {
	@Autowired
	CustService service;
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("center", "register");
		return "index";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, CustDTO cust, HttpSession session) {
		try {
			System.out.println(cust);
			service.register(cust);
			session.setAttribute("logincust", cust);
			model.addAttribute("center", "registerok");
			model.addAttribute("rid", cust);
		} catch (Exception e) {
			model.addAttribute("center", "registerfail");
			model.addAttribute("fid", cust);
		}
		
		return "index";
	}
}
