package com.semi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

	@RequestMapping("/review")
	public String review(Model model) {
		model.addAttribute("center","review");
		return "index";
	}
}
