package com.semi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.OrderinfoDTO;
import com.semi.frame.MyMapper;

@Repository
@Mapper
public interface OrderinfoMapper extends MyMapper<Integer, OrderinfoDTO> {
	public List<OrderinfoDTO> orderdetail(int orderid) throws Exception;
}
