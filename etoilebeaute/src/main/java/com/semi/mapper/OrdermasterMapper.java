package com.semi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.OrdermasterDTO;
import com.semi.frame.MyMapper;

@Repository
@Mapper
public interface OrdermasterMapper extends MyMapper<Integer, OrdermasterDTO> {
	public List<OrdermasterDTO> orderlist(String custid) throws Exception;
}
