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
public class CartDTO {
	private int cartid;
	private int itemid;
	private String custid;
	private int cnt;
	private String cartdate;
	
	private String custname;
	private String itemname;
	private String itemimg;
	private int itemprice;
}
