package com.semi.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semi.dto.CustDTO;
import com.semi.dto.MarkerDTO;
import com.semi.mapper.AJAXMapper;
import com.semi.service.CustService;
import com.semi.service.MarkerService;

@RestController
public class AjaxController {
		
	@Autowired
	AJAXMapper mapper;
	
	@Autowired
	CustService cust_service;
	
	@Autowired
	MarkerService service;

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

	@RequestMapping("/cartcnt")
	public String cartcnt(String custid) {
		int cnt = mapper.getCartCnt(custid);
		return cnt+"";
	}
	
	@RequestMapping("/couponcnt")
	public String couponcnt(String custid) {
		int cnt = mapper.getCouponCnt(custid);
		return cnt+"";
	}
	
	@RequestMapping("/getmarker")
	public Object getmarker(String loc) {
		JSONArray ja = new JSONArray();
		
		List<MarkerDTO> list = null;
		
		try {
			list = service.getloc(loc); 
			for(MarkerDTO m :list) {
				JSONObject jo = new JSONObject();
				jo.put("title", m.getTitle());
				jo.put("target", m.getTarget());
				jo.put("lat", m.getLat());
				jo.put("lng", m.getLng());
				jo.put("loc", m.getLoc());
				jo.put("img", m.getImg());
				ja.add(jo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return ja;
	}
	


}
