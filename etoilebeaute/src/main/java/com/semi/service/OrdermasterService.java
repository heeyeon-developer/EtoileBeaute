package com.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.dto.OrdermasterDTO;
import com.semi.frame.MyService;
import com.semi.mapper.OrdermasterMapper;

@Service
public class OrdermasterService implements MyService<Integer, OrdermasterDTO>{
	
	@Autowired
	OrdermasterMapper mapper;
	
	@Override
	public void register(OrdermasterDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(OrdermasterDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public OrdermasterDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<OrdermasterDTO> getall() throws Exception {
		return mapper.selectall();
	}
	
	public List<OrdermasterDTO> orderlist(String custid) throws Exception {
		return mapper.orderlist(custid);
	}

}

