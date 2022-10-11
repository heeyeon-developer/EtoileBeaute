package com.semi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.ItemDTO;
import com.semi.frame.MyMapper;

@Repository
@Mapper
public interface ItemMapper extends MyMapper<Integer, ItemDTO> {
	
}
