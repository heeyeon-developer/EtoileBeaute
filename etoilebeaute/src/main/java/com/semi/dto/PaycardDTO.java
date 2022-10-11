package com.semi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.StandardException;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PaycardDTO {
	private int paykindid;
	private int payid;
	private	int cardno;
}
