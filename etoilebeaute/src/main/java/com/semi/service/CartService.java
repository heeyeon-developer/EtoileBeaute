package com.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.dto.CartDTO;
import com.semi.frame.MyService;
import com.semi.mapper.CartMapper;

@Service
public class CartService implements MyService<Integer,CartDTO> {

	@Autowired
	CartMapper mapper;

	@Override
	public void register(CartDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(CartDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public CartDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<CartDTO> getall() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CartDTO> get_cartitem(String custid) {
		// TODO Auto-generated method stub
		try {
			return mapper.select_cartitem(custid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	

}
