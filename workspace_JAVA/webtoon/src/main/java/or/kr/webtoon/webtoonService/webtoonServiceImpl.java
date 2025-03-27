package or.kr.webtoon.webtoonService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import or.kr.webtoon.webtoonDAO.webtoonDAO;

@Service
public class webtoonServiceImpl implements webtoonService{

	@Autowired
	webtoonDAO dao;
	
	@Override
	public List selectList() {
		
		List list = dao.getList();
		
		return list;
	}

}
