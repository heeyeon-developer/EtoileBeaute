package com.semi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.ItemDTO;
import com.semi.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	ItemService service;
	
	// perfumes
	@RequestMapping("/per_aesop")
	public String main(Model model, Integer cateid) {
		
		List<ItemDTO> list = null;
		try {
			list = service.itemall(101);
			model.addAttribute("aesoplist", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
		
	}

	@RequestMapping("/per_jomalone")
	public String per_jomalone(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(102);
			model.addAttribute("jolist", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/per_maison")
	public String per_maison(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(103);
			model.addAttribute("maslist", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/per_santa")
	public String per_santa(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(104);
			model.addAttribute("sanlist", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/per_goutal")
	public String per_goutal(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(105);
			model.addAttribute("golist", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	// body
	@RequestMapping("/body_aesop")
	public String body_aesop(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(201);
			model.addAttribute("aesopbody", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/body_jomalone")
	public String body_jomalone(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(202);
			model.addAttribute("jobody", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/body_maison")
	public String body_maison(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(203);
			model.addAttribute("mabody", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/body_santa")
	public String body_santa(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(204);
			model.addAttribute("santabody", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	
	// candle
	@RequestMapping("/cand_aesop")
	public String cand_aesop(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(301);
			model.addAttribute("aesopcand", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/cand_jomalone")
	public String cand_jomalone(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(302);
			model.addAttribute("jocand", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/cand_maison")
	public String cand_maison(Model model, Integer cateid) {
		List<ItemDTO> list = null;
		try {
			list = service.itemall(303);
			model.addAttribute("maisoncand", list);
			model.addAttribute("center", "shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	
	@RequestMapping("/product_details")
	public String product_details(Model model, int itemid) {
		ItemDTO item = null;
		try {
			item = service.get(itemid);
			model.addAttribute("item_detail", item);
			model.addAttribute("center", "product_details");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return "index";
	}
	
	
		
}
