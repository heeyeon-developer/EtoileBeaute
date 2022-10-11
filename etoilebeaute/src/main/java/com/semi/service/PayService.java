package com.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.dto.PayDTO;
import com.semi.frame.MyService;
import com.semi.mapper.PayMapper;

@Service
public class PayService implements MyService<Integer,PayDTO> {

	
	
	@Autowired
	PayMapper mapper;
	
	@Override
	public void register(PayDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(PayDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public PayDTO get(Integer k) throws Exception {
	
		return mapper.select(k);
	}

	@Override
	public List<PayDTO> getall() throws Exception {
		
		return mapper.selectall();
	}

}
