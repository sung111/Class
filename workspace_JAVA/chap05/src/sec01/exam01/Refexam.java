package sec01.exam01;

public class Refexam {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		System.out.println(a + ", " + b);
		b = 12;
		System.out.println(a + ", " + b);
		
		String c = "강아지";
		// =을 기준으로 오른쪽이 먼저 실행됨.
		// "강아지"를 힙 HEAP 영역의 비어있는 번지에 할당
		// 스택 stack 영역의 변수 c에 그 번지가 기록된다.
		
		System.out.println("c : " + c);
		System.out.println(a==b);
		// == 무조건 stack의 값을 비교한다.
		
		//무조건 힙영역의 새로운 번지에 할당하는 방법
		String d = new String("강아지");
		System.out.println(d);
		System.out.println(c==d);
		// == 무조건 stack의 값을 비교한다.
		System.out.println(c.equals(d));
		
		String e = "강아지";
		System.out.println(c == e);
		
		
//		==, !=
//		stack 영역의 값만 비교한다.
//		참조타입의 경우 주소만 비교한다.
//		그래서 String 은 equals()를 사용해서 비교해야한다.
		
//		String
//		java는 자주쓰는 String 을 효율적으로 관리해줌.
		
//		참조하는 주소가없는 상태 ==  null
		String f = "휴먼";
		System.out.println(" f == null : " + (f == null));
		System.out.println(" f != null : " + (f != null));
		
		f = null;
		System.out.println(" f == null : " + (f == null));
		System.out.println(" f != null : " + (f != null));
		
		System.out.println("f + \"abc\" : " + (f + "abc"));
		
//		초기화나 값이 할당되지 않은 경우 사용은 못한다.
		String g = null;
		System.out.println("g == null : " + (g == null));
		
//		System.out.println("g.equals : " + g.equals(c));
		
		if( g != null) {
			System.out.println("g.equals : " + g.equals(c));
		}
		
		
		
		
	}

}
