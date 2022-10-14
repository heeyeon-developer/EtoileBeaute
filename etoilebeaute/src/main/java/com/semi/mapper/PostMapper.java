package com.semi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.PostDTO;
import com.semi.frame.MyMapper;

@Mapper
@Repository
public interface PostMapper extends MyMapper<Integer,PostDTO> {
	public PostDTO getcustpost(String custid) throws Exception;
}
