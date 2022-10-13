package com.semi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AJAXMapper  {
	public int getCartCnt(String custid);
	public int getCouponCnt(String custid);
}
