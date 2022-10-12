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
public class ItemDTO {
	private int itemid; 
	private int cateid; 
	private String name; 
	private int price; 
	private String img; 
	private Date itemdate; 
	private int stock; 
}
