package kr.or.human.service;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface EmpService {
	public List<EmpDTO> selectList();
	public EmpDTO getEmpOne();
	public EmpDTO getEmpno(int a);
	public EmpDTO getEmpno2(EmpDTO empDTO);
}
