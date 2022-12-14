package com.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.dto.ItemDTO;
import com.semi.frame.MyService;
import com.semi.mapper.ItemMapper;

@Service
public class ItemService implements MyService<Integer, ItemDTO>{
	@Autowired
	ItemMapper mapper;
	@Override
	public void register(ItemDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(ItemDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public ItemDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<ItemDTO> getall() throws Exception {
		return mapper.selectall();
	}
	
	public List<ItemDTO> itemall(int cateid) throws Exception{
		return mapper.itemall(cateid);
	}
	
	public List<ItemDTO> bestitem() throws Exception{
		return mapper.bestitem();
	}
	

}

