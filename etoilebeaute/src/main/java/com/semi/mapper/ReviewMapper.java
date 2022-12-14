package com.semi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.ReviewDTO;
import com.semi.frame.MyMapper;

@Mapper
@Repository
public interface ReviewMapper extends MyMapper<Integer,ReviewDTO> {
	public List<ReviewDTO> select_itemreview(Integer itemid) throws Exception;
}
