package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println(list.isEmpty());

		// 추가
		list.add(10);
		list.add("글씨");

		// 중간에 삽입
		list.add(1, 123);
		System.out.println(list);

		// 전체 크기
		System.out.println(list.size());

		// 삭제
		list.remove(1);
		System.out.println(list);

		// 읽기
//		int a = (int)list.get(100);
		int a = (int) list.get(0);

		// 초기화
		list.clear();
		list = new ArrayList();

		System.out.println("--------------");
		
		HashMap map1 = new HashMap();
		Map map = new HashMap();
		
//		추가
//		순서는 보장하지않음
		map.put("k1", 10);
		map.put("abc", list);
		
//		가져오기 
		int k1 = (int)map.get("k1");
		
		System.out.println( k1 );
//		key 가 없으면 null
		System.out.println(map.get("k2"));
		
//		초기화
		map = new HashMap();
		
		list = new ArrayList();
		
		
		map = new HashMap();
		map.put("제목", "뱅뱅뱅");
		map.put("가수", "빅뱅");
		list.add(map);
		
//		map = new HashMap(); 		// 마지막 값만 여러번 나온다면 new 해줘야한다.
		map = new HashMap();
		map.put("제목", "바람이분다");
		map.put("가수", "이소라");
		list.add(map);
		
		System.out.println(list);
		
		
//		제네릭 : <String>
//		60점 : 추가할 자료형을 제한하는 용도
//		200 점 : 전달인자나 리턴타입의 자료형을 동적으로변경
		List<String> list1 = new ArrayList<String>();
		list1.add("ABC");
//		list1.add(123);
		String str = list1.get(0);
		
//		제네릭에 int 즉 원시타입은 사용불가 wrapper 클래스 사용
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("str",123);
		
		int c = map2.get("str");
		
		
		
		
		
		
		
		
	}

}