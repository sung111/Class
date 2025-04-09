package kr.or.human99.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human99.dao.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardDAO dao;
	
	@Override
	public List selectAllBoard() {
		
		List result = dao.selectAllBoard();
		System.out.println("result :" + result);
		
		return result;
	}
	
}
