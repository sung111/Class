package kr.or.human99.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDTO {
	
	private int bc;
	private String title;
	private String contentt;
	private Date createdate;
	private String person;
	private String categoryy;
	private int count;
	
}
