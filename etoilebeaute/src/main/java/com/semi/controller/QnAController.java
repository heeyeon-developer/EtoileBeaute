package com.semi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.AnswerDTO;
import com.semi.dto.QuestDTO;
import com.semi.dto.ReviewDTO;
import com.semi.service.AnswerService;
import com.semi.service.QuestService;
import com.semi.service.ReviewService;

@Controller
public class QnAController {

	@Autowired
	QuestService service;
	
	@Autowired
	AnswerService answer_service;
	
	@RequestMapping("/qna")
	public String quest(Model model, Integer itemid, String custid) {
		List<QuestDTO> list = null;
		
		try {
			list = service.get_itemquest(itemid);
			model.addAttribute("itemid",itemid);
			model.addAttribute("custid",custid);
			model.addAttribute("list",list);
			model.addAttribute("center","quest");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "index";
	}
	
	@RequestMapping("/writequest")
	public String writequest(Model model, int itemid, String custid) {
		model.addAttribute("itemid",itemid);
		model.addAttribute("custid",custid);
		model.addAttribute("center","writequest");
		return "index";
	}
	
	@RequestMapping("/registerquest")
	public String registerquest(Model model, Integer itemid, String custid, String title, String quest_text) {
		QuestDTO quest = new QuestDTO(0, itemid, custid, title, quest_text, null);
		try {
			service.register(quest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:qna?itemid="+itemid;
	}
	
	@RequestMapping("/answer")
	public String answer(Model model, Integer questid, Integer ansid) {
		List<AnswerDTO> list = null;
		try {
			list = answer_service.get_quest(questid);
			model.addAttribute("questid", questid);
			model.addAttribute("ansid", ansid);
			model.addAttribute("list", list);
			model.addAttribute("center", "answer");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "index";
	}
	
}

