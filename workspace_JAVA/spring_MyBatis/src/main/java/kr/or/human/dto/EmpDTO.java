package kr.or.human.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

//DTO : Data Transfer Object
//VO : Value Object
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor // 생성자
//@EqualsAndHashCode
@Data
public class EmpDTO {
	
	private int empno; // 사원번호
	private String ename; // 사원명
	private String job;
	private int mgr;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date hiredate;
	private int sal;
	private Integer comm;
	private int deptno;
	
	private int page;		//현재 페이지
	private int viewCount;	//페이지당 보여줄 수 countPerPage or rowPerpage
	private int indexStart;
	private int indexEnd;
	
	
	
	
}
