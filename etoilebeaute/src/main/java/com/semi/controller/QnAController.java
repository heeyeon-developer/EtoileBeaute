package com.semi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.QuestDTO;
import com.semi.dto.ReviewDTO;
import com.semi.service.QuestService;
import com.semi.service.ReviewService;

@Controller
public class QnAController {

	@Autowired
	QuestService service;
	
	@RequestMapping("/qna")
	public String quest(Model model, Integer itemid) {
		List<QuestDTO> list = null;
		
		try {
			list = service.get_itemquest(itemid);
			model.addAttribute("list",list);
			model.addAttribute("center","quest");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "index";
	}
}

