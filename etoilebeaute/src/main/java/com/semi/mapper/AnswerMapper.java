package com.semi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.AnswerDTO;
import com.semi.frame.MyMapper;

@Mapper
@Repository
public interface AnswerMapper extends MyMapper<Integer, AnswerDTO> {
	public List<AnswerDTO> select_quest(Integer questid) throws Exception;
}
