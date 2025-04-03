package kr.or.human.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import kr.or.human.dto.EmpDTO;

// MyBatis에서 제공해주는 어노테이션
@Mapper
public interface EmpMapperDAO {
	
//	xml의 namespace 값에
//	kr.or.human.dao.mapper.EmpMapperDAO [패키지.인터페이스명] 을 넣어준다.
//	그러면 id와 메소드 명이 같으면 리턴해준다.
	
	List<EmpDTO> selectEmp();
	
	@Select("select * from emp2 where empno = #{empno}")
	List<EmpDTO> selectDetailEmp2(@Param("empno") int empno);
	
	
}
