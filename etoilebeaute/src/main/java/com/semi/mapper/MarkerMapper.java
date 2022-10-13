package com.semi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.MarkerDTO;
import com.semi.frame.MyMapper;

@Mapper
@Repository
public interface MarkerMapper extends MyMapper<Integer,MarkerDTO> {
	List<MarkerDTO> getloc(String loc) throws Exception;
}
