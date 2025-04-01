package kr.or.human.dao;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface EmpDAO {
	public List<EmpDTO> selectEmpList();
	public EmpDTO selectOneEmp();
	public EmpDTO selectOneEmpno(int a);
	public EmpDTO selectOneEmpno2(EmpDTO empDTO);
	public int update(EmpDTO empDTO);
	public int insert(EmpDTO empDTO);
}
