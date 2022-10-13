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
public class OrderinfoDTO {
	private int orderinfoid;
	private int orderid;
	private int itemid;
	private int psid;
	private int cnt;
	private int price;
	
	private String orderdate;
	private String img;
	private String name;
	private int rate;
	private String coupon_name;
	private int total_price;
	private int order_price;
	

}
