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
public class CustDTO {

	private String  custid;
	private String pwd;
	private String name;
	private String addr;
	private Date rdate;
	private String email;
	private String phone;
	private String birth;
	
	
}
