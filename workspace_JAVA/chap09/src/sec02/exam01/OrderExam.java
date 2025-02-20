package sec02.exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {
		
		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();
		
		m1.name = "¸â¹ö 1";
		m1.age = 65;
		
		m2.name = "¸â¹ö 2";
		m2.age = 30;
		
		m3.name = "¸â¹ö 3";
		m3.age = 35;
		
		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		Comparator c = new OrderBy();
		
		Comparator c2 = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				MemberDTO dto1 = (MemberDTO)o1; 
				MemberDTO dto2 = (MemberDTO)o2;
				
				int result = dto1.age - dto2.age;
				
				return result;
			}
			
		};
		
		
		Collections.sort(list, c2);
		
		for(int i = 0 ; i < list.size() ; i++) {
			MemberDTO dto = (MemberDTO)list.get(i);
			System.out.println(dto.age);
		}
		
		
		

	}

}
