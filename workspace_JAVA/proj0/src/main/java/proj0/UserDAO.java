package proj0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDAO {
	
	boolean checkLogin(String id, String pw){
		
		boolean result = false;
		
		System.out.println("UserDAO areyoumember 실행");
		
		
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			
			Connection con = ds.getConnection();
			
			String query = " select * from loginuser where user_id = 'admin' ";
			PreparedStatement pstmt = con.prepareStatement(query);
			
//			executeQuery : SQL 중 select 실행
//			executeUpdate : select 외 모든것
//			ResultSet : select 조회 결과 전체 : 엑셀 테이블 느낌
			
			ResultSet rs = pstmt.executeQuery();
			
			if( rs.next() ) {
				result=true;
			} else {
				System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
			}
			
			con.close();
			
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	
	
	
	
}

