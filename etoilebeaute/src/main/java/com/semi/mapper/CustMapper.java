package com.semi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.CustDTO;
import com.semi.frame.MyMapper;

@Mapper
@Repository
public interface CustMapper extends MyMapper<String,CustDTO> {

}
