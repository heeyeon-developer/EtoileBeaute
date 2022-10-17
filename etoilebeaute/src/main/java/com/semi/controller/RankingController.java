package com.semi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RankingController {

	@RequestMapping("/ranking")
	public String ranking(Model model) {
		model.addAttribute("center", "ranking");
		
		return "index";
	}
	
}
