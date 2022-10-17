package com.semi.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semi.dto.CartDTO;
import com.semi.dto.CustDTO;
import com.semi.dto.MarkerDTO;
import com.semi.mapper.AJAXMapper;
import com.semi.service.CartService;
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
	@Autowired
	CartService cart_service;

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

	@RequestMapping({"/getmarker2"})         //로케이션에 대한 정보 요청하면~ 
	public Object getmarker2(String loc) {
		JSONArray ja = new JSONArray();
		
		JSONObject jo1 = new JSONObject();
		jo1.put("title", "Étoile Beauté");
		jo1.put("target", "http://www.naver.com");
		jo1.put("lat", 37.56014367008594);
		jo1.put("lng", 126.98071970839374);
		ja.add(jo1);
		
		return ja;
	}
	
	@RequestMapping("/addcart")
	public Object addcart(String custid, int itemid, int cnt) {
		String result = "";
		CartDTO cart = new CartDTO(0,itemid,custid,cnt,"","","","",0);
		try {
			cart_service.register(cart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
