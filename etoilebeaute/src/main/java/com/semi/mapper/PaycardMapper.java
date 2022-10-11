package com.semi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.PaycardDTO;
import com.semi.frame.MyMapper;

@Mapper
@Repository
public interface PaycardMapper extends MyMapper<Integer,PaycardDTO>{

}
