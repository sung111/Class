package kr.or.human.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human.dao.EmpDAO;
import kr.or.human.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List<EmpDTO> selectList() {
		
		List<EmpDTO> list = empDAO.selectEmpList();
		
		return list;
	}

	
	@Override
	public EmpDTO getEmpOne() {
		
		EmpDTO dto = empDAO.selectOneEmp();
		
		return dto;
	}


	@Override
	public EmpDTO getEmpno(int a) {
		EmpDTO dto = empDAO.selectOneEmpno(a);
		return dto;
	}
	@Override
	public EmpDTO getEmpno2(EmpDTO empDTO) {
		EmpDTO dto = empDAO.selectOneEmpno2(empDTO);
		return dto;
	}
	@Override
	public int setUpdate(EmpDTO empDTO) {
		int result = empDAO.update(empDTO);
		return result;
	}
	@Override
	public int setInsert(EmpDTO empDTO) {
		int result = empDAO.insert(empDTO);
		return result;
	}
	
	@Override
	public List search(EmpDTO empDTO) {
		List list = new ArrayList();
		
		int page = empDTO.getPage();
		int viewCount = empDTO.getViewCount();
		
		int indexStart = (viewCount * (page-1)) + 1;
		int indexEnd = page * viewCount;
		empDTO.setIndexStart(indexStart);
		empDTO.setIndexEnd(indexEnd);
		System.out.println("dto!!!! : " +  empDTO);
		
//		list = empDAO.search(empDTO);
		list = empDAO.selectPageEmp(empDTO);
		return list;
	}
	
	
	
	
	

}
