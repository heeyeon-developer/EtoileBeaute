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
public class CouponDTO {
	private int couponid;
	private String custid;
	private String coupon_name;
	private int rate;
	private int dprice;
	private String info;
	private String cstatus;
	
}
