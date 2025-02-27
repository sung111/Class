package kr.or.human.service;

import java.util.List;

import kr.or.human.dao.EmpDAO;

public class EmpService {
	
	public List getEmpList() {
		
		System.out.println("EmpService getEmpList 실행");
		
		EmpDAO empDAO = new EmpDAO();
		List list = empDAO.selectMepList();
		System.out.println( "목록의 길이는 :" + list.size() );
		
		return list;
	}
	
	
	
	
}
