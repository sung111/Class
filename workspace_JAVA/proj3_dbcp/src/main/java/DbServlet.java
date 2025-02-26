

import java.io.IOException;
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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import kr.or.human.dto.EmpDTO;

@WebServlet("/db")
public class DbServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/db doGet 실행");
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
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
				
				list.add(empDTO);
				
				
			}
			
//			Map map = list.get(0);
//			EmpDTO map = list.get(0);
			
//			View
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.getWriter().println("<style>*{font-size:30px; border:solid 1px red;}</style>");
		response.getWriter().println("<table>");
		response.getWriter().println("<tr>");
		response.getWriter().println("<th>");
		response.getWriter().println("Empno");
		response.getWriter().println("</th>");
		response.getWriter().println("<th>");
		response.getWriter().println("Ename");
		response.getWriter().println("</th>");
		response.getWriter().println("<th>");
		response.getWriter().println("Hiredate");
		response.getWriter().println("</th>");
		response.getWriter().println("</tr>");
		
		for(int i = 0 ; i < list.size() ; i++) {
			response.getWriter().println("<tr>");
			response.getWriter().println("<td>");
			response.getWriter().println(list.get(i).getEmpno());
			response.getWriter().println("</td>");
			response.getWriter().println("<td>");
			response.getWriter().println(list.get(i).getEname());
			response.getWriter().println("</td>");
			response.getWriter().println("<td>");
			response.getWriter().println(list.get(i).getHiredate());
			response.getWriter().println("</td>");
			response.getWriter().println("</tr>");
		}
		response.getWriter().println("</table>");
	}

}
