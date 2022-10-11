package com.semi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.PostDTO;
import com.semi.frame.MyMapper;

@Mapper
@Repository
public interface PostMapper extends MyMapper<Integer,PostDTO> {

}
