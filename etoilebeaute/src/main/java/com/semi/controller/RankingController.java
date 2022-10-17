package com.semi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.ItemDTO;
import com.semi.service.ItemService;

@Controller
public class RankingController {

	@Autowired
	ItemService service;
	
	@RequestMapping("/ranking")
	public String main(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.bestitem();
			model.addAttribute("list", list);
			model.addAttribute("center", "ranking");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "index";
	}
}

