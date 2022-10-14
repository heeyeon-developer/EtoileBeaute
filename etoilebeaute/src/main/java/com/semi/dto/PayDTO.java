package com.semi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PayDTO {
	private int payid;
	private String custid;
	private int orderid;
	private String paystatus;
	private int pay;
	
	private String custname;
	private int phone;
	private String addr;
	private String detail_addr;
	private int zipcode;
	private String itemname;
	private int cnt;
	private int order_price;
	private int total_price;
	private String img;
	
}
