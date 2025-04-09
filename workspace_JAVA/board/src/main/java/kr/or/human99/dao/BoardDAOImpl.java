package kr.or.human99.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	SqlSession sqlSession;

	@Override
	public List selectAllBoard() {
		
		List result = sqlSession.selectList("board.selectAllBoard");
		
		return result;
	}
	
	
	
	
	
}
