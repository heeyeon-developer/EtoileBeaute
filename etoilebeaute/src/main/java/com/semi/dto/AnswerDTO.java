package com.semi.dto;

import java.util.Date;

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
public class AnswerDTO {
	private int ansid;
	private String admid;
	private int questid;
	private String title;
	private String ans_text;
	private int selected;
	private Date rdate;

}
