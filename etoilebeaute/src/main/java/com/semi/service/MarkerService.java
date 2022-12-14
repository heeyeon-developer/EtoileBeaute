package com.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.dto.MarkerDTO;
import com.semi.frame.MyService;
import com.semi.mapper.MarkerMapper;

@Service
public class MarkerService implements MyService<Integer,MarkerDTO> {

	@Autowired
	MarkerMapper mapper;

	@Override
	public void register(MarkerDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(MarkerDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public MarkerDTO get(Integer k) throws Exception {
		
		return mapper.select(k);
	}

	@Override
	public List<MarkerDTO> getall() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}
	
	public List<MarkerDTO> getloc(String loc) throws Exception {
		return mapper.getloc(loc);
	}

	
	


}
