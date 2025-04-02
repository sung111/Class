package kr.or.human.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human.dto.EmpDTO;


@Repository
public class EmpDAOImpl implements EmpDAO{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<EmpDTO> selectEmpList() {
		List<EmpDTO> reslut = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("reslut :" + reslut);
		return reslut;
	}
	
	@Override
	public EmpDTO selectOneEmp() {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectOnEmp");
		System.out.println("dto :" + dto);
		return dto;
	}
	@Override
	public EmpDTO selectOneEmpno(int a) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectOneEmpno", a);
		System.out.println("dto :" + dto);
		return dto;
	}
	@Override
	public EmpDTO selectOneEmpno2(EmpDTO empDTO) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectOneEmpno2", empDTO);
		System.out.println("dto :" + dto);
		return dto;
	}
	
	@Override
	public int update(EmpDTO empDTO) {
		System.out.println(empDTO);
		int result = sqlSession.update("mapper.emp.update", empDTO);
		System.out.println("result :" + result);
		return result;
	}
	
	@Override
	public int insert(EmpDTO empDTO) {
		System.out.println(empDTO);
		int result = sqlSession.update("mapper.emp.insert", empDTO);
		System.out.println("result :" + result);
		return result;
	}
	
	@Override
	public List search(EmpDTO empDTO) {
		System.out.println(empDTO);
		List list = sqlSession.selectList("mapper.emp.dynamic.searchEmp", empDTO);
		System.out.println("searchEmp :" + list );
		return list;
	}

	
}
