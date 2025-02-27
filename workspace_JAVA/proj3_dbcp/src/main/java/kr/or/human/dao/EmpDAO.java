package kr.or.human.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import kr.or.human.dto.EmpDTO;

//Data Access Object
public class EmpDAO {
	
	public List selectMepList() {
		
		System.out.println("EmpDao SelectMepList 실행");
		
		List resultList = new ArrayList();
		
		try {
			
//			DB 접속시작
//			context.xml의 Resource중에 jdbc/oracle 가져오기
//			JNDI 방식으로 가져오기
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:/comp/env/jdbc/oracle");
//			커넥션 풀에서 접속 정보를 가져오기
//			접속이안되면 null
			Connection con = ds.getConnection();
//			DB접속 완료

//			SQL 준비
			String query = "select * from emp";
			
			PreparedStatement ps = con.prepareStatement(query);
			
//			SQL 실행 및 결과 확보
//			excuteQuery : SQL 중 select 실행
//			excuteUpdate : select 외 모든것
//			ResultSet : select 조호 ㅣ결과 전체 : 엑셀 테이블 느낌
			ResultSet rs = ps.executeQuery();
			
//			결과활용
//			rs.next();  // 다음줄로 커서이동
						// 다음줄이있으면 true, 없으면 false return
			
			
			while ( rs.next() ) { // 다음줄이 없을때까지 반복
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				Date hiredate = rs.getDate("hiredate");
				
				System.out.println("------------");
				System.out.println("empno :" + empno);
				System.out.println("ename :" + ename);
				System.out.println("hiredate :" + hiredate);
				System.out.println();
				
				Map map = new HashMap();
				map.put("empno", empno);
				map.put("ename", ename);
				map.put("hiredate", hiredate);
				
				EmpDTO empDTO = new EmpDTO();
				empDTO.setEmpno(empno);
				empDTO.setEname(ename);
				empDTO.setHiredate(hiredate);
				
				resultList.add(empDTO);
			}
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resultList;
		
	}
	
	
	

}
