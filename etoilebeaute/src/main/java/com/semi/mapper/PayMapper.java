package com.semi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.PayDTO;
import com.semi.frame.MyMapper;

@Mapper
@Repository
public interface PayMapper extends MyMapper<Integer,PayDTO> {

}
