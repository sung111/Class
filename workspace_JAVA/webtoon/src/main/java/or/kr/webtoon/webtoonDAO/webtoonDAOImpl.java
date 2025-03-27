package or.kr.webtoon.webtoonDAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import or.kr.webtoon.webtoonDTO.webtoonDTO;

@Repository
public class webtoonDAOImpl implements webtoonDAO {

	@Override
	public List getList() {
		List list = new ArrayList();
		
		webtoonDTO dto = new webtoonDTO();
		dto.setImg("https://image-comic.pstatic.net/webtoon/837022/thumbnail/titledescimage/frontImage_fa6d5bcc-7eaf-4dbe-9dfc-5f1cde0feda0.png");
		dto.setTitle("전생혈마");
		dto.setPerson("장작가 / 산천");
		dto.setContent("재능도, 능력도, 스킬도 없는 하위 1% 탱커 강산. 불행 그 자체인 그의 앞에 신의 사자가 나타난다."
				+ "“당신은 전생에 혈마였습니다.”"
				+ "전생의 업보를 해소하기 위해 혹독한 시련을 감당해야 한다."
				+ "하지만 그 대가로 막대한 보상이 주어진다고?"
				+ "“좋아. 원하는 대로 다 해주지.” "
				+ "나약한 F급 탱커, 피로 물든 운명을 바꿀 수 있을까?");
		dto.setTag("#판타지");
		
		list.add(dto);
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		
		return list;
	}

}
