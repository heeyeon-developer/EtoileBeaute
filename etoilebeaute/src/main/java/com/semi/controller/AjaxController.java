package com.semi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.semi.dto.CustDTO;
import com.semi.mapper.AJAXMapper;
import com.semi.service.CustService;

@RestController
public class AjaxController {
		
	@Autowired
	AJAXMapper mapper;
	

	@RequestMapping("/cartcnt")
	public String cartcnt(String custid) {
		int cnt = mapper.getCartCnt(custid);
		return cnt+"";
	}
	
}
