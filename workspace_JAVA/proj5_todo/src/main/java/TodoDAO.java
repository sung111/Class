import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TodoDAO {

	public int insertTODO(TodoDTO todoDTO) {

		System.out.println("TodoDTO insrtTodo 실행");

		int result = -1;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			Connection con = ds.getConnection();

			String query = " insert into todo "
//					 방법1 : sql String을 그냥만들기
//					+ " values ( seq_todo.nextval, '"+ todoDTO.getTodo() +"', sysdate, null, 'N' )";
//					 방법2 : ? 활용하기
					+ " values ( seq_todo.nextval, ?, sysdate, null, 'N' )";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, todoDTO.getTodo());

//			executeQuery : SQL 중 select 실행
//			executeUpdate : select 외 모든것
//			ResultSet : select 조호 ㅣ결과 전체 : 엑셀 테이블 느낌
			result = ps.executeUpdate();


			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	List selectTodoList() {
		System.out.println("selectTodoList 실행");
		List list = new ArrayList();

		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			Connection con = ds.getConnection();

			String query = " select * from todo ";
			PreparedStatement ps = con.prepareStatement(query);


//			excuteQuery : SQL 중 select 실행
//			executeUpdate : select 외 모든것
//			ResultSet : select 조호 ㅣ결과 전체 : 엑셀 테이블 느낌
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				TodoDTO dto = new TodoDTO();
				dto.setTodo_id(rs.getInt("todo_id"));
				dto.setTodo(rs.getString("todo"));
				dto.setCreate_date(rs.getDate("create_date"));
				dto.setModify_date(rs.getDate("modify_date"));
				dto.setDone(rs.getString("done"));

				list.add(dto);
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	
	public int updateTodo(TodoDTO todoDTO) {

		System.out.println("TodoDTO updateTodo 실행");
		System.out.println(todoDTO);

		int result = -1;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			Connection con = ds.getConnection();

			String query = " update todo ";
					query += " set done = ? ";
					query += " where todo_id = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString( 1, todoDTO.getDone() );
			ps.setInt( 2, todoDTO.getTodo_id() );

//			executeQuery : SQL 중 select 실행
//			executeUpdate : select 외 모든것
//			ResultSet : select 조호 ㅣ결과 전체 : 엑셀 테이블 느낌
			result = ps.executeUpdate();


			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	

}
