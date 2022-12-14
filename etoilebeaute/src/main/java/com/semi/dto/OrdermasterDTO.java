package com.semi.dto;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OrdermasterDTO {
	private int orderid;
	private int couponid;
	private String custid;
	private Date orderdate;
	private int cnt;
	private int total_price;
	

}
