package com.semi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/shop")
	public String shop(Model model) {
		model.addAttribute("center","shop");
		return "index";
	}
}
