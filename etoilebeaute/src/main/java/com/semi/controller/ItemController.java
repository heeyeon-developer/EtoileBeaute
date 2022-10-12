package com.semi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.ItemDTO;
import com.semi.service.ItemService;

@Controller
@RequestMapping("/shop")
public class ItemController {

	String dir = "shop/";
	
	@Autowired
	ItemService service;
	
	@RequestMapping("/perfumes")
	public String main(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(101);
			model.addAttribute("itemlist", list);
			model.addAttribute("center", dir+"perfumes");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}

}
