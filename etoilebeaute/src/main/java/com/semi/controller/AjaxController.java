package com.semi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.dto.CustDTO;
import com.semi.service.CustService;

@Controller
public class AjaxController {
	@Autowired
	CustService cust_service;
	
	@RequestMapping({"/checkid"})
	public Object checkid(String cid) {
		String result = "";
		CustDTO cust = null;
		
		try {
			cust_service.get(cid);
			if(cust != null) {
				result = "f";
			} else {
				result = "t";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
