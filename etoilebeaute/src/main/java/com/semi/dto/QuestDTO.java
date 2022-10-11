package com.semi.dto;

import java.sql.Date;

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
public class QuestDTO {
	private int questid;
	private int itemid;
	private String custid;
	private String title;
	private String quest_text;
	private Date rdate;
}