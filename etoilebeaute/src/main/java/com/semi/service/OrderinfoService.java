package com.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.dto.OrderinfoDTO;
import com.semi.frame.MyService;
import com.semi.mapper.OrderinfoMapper;

@Service
public class OrderinfoService implements MyService<Integer, OrderinfoDTO>{
	
	@Autowired
	OrderinfoMapper mapper;

	@Override
	public void register(OrderinfoDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(OrderinfoDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public OrderinfoDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<OrderinfoDTO> getall() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<OrderinfoDTO> orderdetail(int orderinfoid) throws Exception {
		return mapper.orderdetail(orderinfoid);
	}
	

}

