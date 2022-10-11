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
public class PostDTO {
	private int postid;
	private String custid;
	private String addr;
	private String detail_addr;
	private int zipcode;
	private String bookmark;
}
