package com.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.dto.PaybankDTO;
import com.semi.frame.MyService;
import com.semi.mapper.PaybankMapper;

@Service
public class PaybankService implements MyService<Integer,PaybankDTO>{

	
	@Autowired
	PaybankMapper mapper;
	
	@Override
	public void register(PaybankDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(PaybankDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public PaybankDTO get(Integer k) throws Exception {
		
		return mapper.select(k);
	}

	@Override
	public List<PaybankDTO> getall() throws Exception {
		
		return mapper.selectall();
	}

}
