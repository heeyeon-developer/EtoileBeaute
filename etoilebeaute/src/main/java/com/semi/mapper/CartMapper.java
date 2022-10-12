package com.semi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.CartDTO;
import com.semi.frame.MyMapper;

@Mapper
@Repository
public interface CartMapper extends MyMapper<Integer,CartDTO> {
	public List<CartDTO> select_cartitem(String custid) throws Exception;
}
