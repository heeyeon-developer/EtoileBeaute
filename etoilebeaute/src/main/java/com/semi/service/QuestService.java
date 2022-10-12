package com.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.dto.QuestDTO;
import com.semi.dto.ReviewDTO;
import com.semi.frame.MyService;
import com.semi.mapper.QuestMapper;

@Service
public class QuestService implements MyService<Integer,QuestDTO> {

	@Autowired
	QuestMapper mapper;
	
	@Override
	public void register(QuestDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(QuestDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public QuestDTO get(Integer k) throws Exception {
	
		return mapper.select(k);
	}

	@Override
	public List<QuestDTO> getall() throws Exception {
		return mapper.selectall();
	}
	
	public List<QuestDTO> get_itemquest(Integer itemid) throws Exception{
		return mapper.select_itemquest(itemid);
	}

}
