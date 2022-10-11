package com.semi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.QuestDTO;
import com.semi.dto.ReviewDTO;
import com.semi.frame.MyMapper;

@Mapper
@Repository
public interface QuestMapper extends MyMapper<Integer,QuestDTO> {

}
