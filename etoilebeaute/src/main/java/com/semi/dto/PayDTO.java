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
}
