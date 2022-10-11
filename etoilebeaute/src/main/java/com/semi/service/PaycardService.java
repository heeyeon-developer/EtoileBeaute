package com.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.dto.PaycardDTO;
import com.semi.frame.MyService;
import com.semi.mapper.PaycardMapper;

@Service
public class PaycardService implements MyService<Integer,PaycardDTO>{

	
	@Autowired
	PaycardMapper mapper;
	
	
	@Override
	public void register(PaycardDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(PaycardDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public PaycardDTO get(Integer k) throws Exception {
		
		return mapper.select(k);
	}

	@Override
	public List<PaycardDTO> getall() throws Exception {
		
		return mapper.selectall();
	}

}
