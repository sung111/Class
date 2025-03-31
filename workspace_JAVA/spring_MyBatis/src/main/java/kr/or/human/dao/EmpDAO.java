package kr.or.human.dao;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface EmpDAO {
	List<EmpDTO> selectEmpList();
	public EmpDTO selectOneEmp();
	EmpDTO selectOneEmpno(int a);
	EmpDTO selectOneEmpno2(EmpDTO empDTO);
}
