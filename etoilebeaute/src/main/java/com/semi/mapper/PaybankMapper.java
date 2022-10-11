package com.semi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi.dto.PaybankDTO;
import com.semi.frame.MyMapper;

@Mapper
@Repository
public interface PaybankMapper extends MyMapper<Integer,PaybankDTO> {

}
