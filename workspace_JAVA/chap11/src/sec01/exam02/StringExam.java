package sec01.exam02;

public class StringExam {

	public static void main(String[] args) {
		
		String s1 = "영일이삼사오육칠팔구삼사";
		
		char c = s1.charAt(0);
		System.out.println(c);
		
		int i = s1.indexOf("삼사");
		System.out.println("indexOf : "+ i);
		
		int i2 = s1.indexOf("a");
		System.out.println("indexOf 없는것 : "+ i2);
		
		int i3 = s1.lastIndexOf("삼사");
		System.out.println("lastIndexOf :"+ i3);
		
		//이메일 양식 점검
		// @ 과 . 이 하나 이상 있어야 정확한 이메일양식이라 판단.
		
		String email = "zmdzmd@naver.com";
		
		int rhf = email.indexOf("@");
		int dot = email.indexOf(".");
		if(rhf > 0 && dot > 0) {
			System.out.println("나옴");
		} else {
			System.out.println("안나옴");
		}
		
		
		
		//replace 는 모두바꿈(비파괴함수)
		String s2 = s1.replace("삼사", "34");
		System.out.println("s1 :" + s1);
		System.out.println("s2 :" + s2);
		
		
		// 시작인덱스부터 종류 인덱스 바로앞까지 잘라서 돌려줌
		String s3 = s1.substring(2,4);
		System.out.println("substring(2,4) :" + s3);
		
		// 성별을 남여 로 출력하기
		String ssn = "123456-1234567";
		int start = ssn.indexOf("-") + 1;
		int end = start+1;
		String s4 = ssn.substring(start, end);
		if(s4.equals("1")||s4.equals("3")) {
			System.out.println("남성");
		} else {
			System.out.println("여성");
		}
		
		System.out.println(ssn.substring(3));
		
//		앞뒤 공백 제거
		String s5 = "    글      씨     중간      ";
		System.out.println("[" + s5 + "]");
		System.out.println("[" + s5.trim() + "]");
		
		
		String menu = "아무거나, 풀떼기, 햄북햄부기";
		String[] menus = menu.split(",");
		for(String m : menus) {
			System.out.println(m.trim());
		}
		
		String url = "cafe.naver.com";
//		String[] urls = url.split(".");			// 정규표현식에서 .은 의미가있는 예약 문자라서 안됨
		String[] urls = url.split("[.]");
		System.out.println(urls.length);
		
//		검색어의 key 값은 query
//		검색어만 출력하도록
		String search = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ssc=tab.nx.all&query=glok3&oquery=glok3&tqi=iJlZHlqo1SCssccybcVssssss2R-109779";
		
		int search1 = search.indexOf("query=");
		System.out.println(search1);
		String z = search.substring(search1);
		System.out.println(z);
		
		
//		html 속성 class 에 cls 의 text가 있을때
//		target 의 class 가 존재하는지 판단
		String cl = "red bigy px";
		String target = "big";
		
		
//		System.gc();
		
//		이거처럼하면 메모리낭비됨
		String a = "a";
		a+="b";
		a+="b";
		
//		메모리 효율적으로 사용하는 법
//		스레드에 안전함. (Thread-safe)
//		StringBuilder 보다 조금느리다.
		StringBuffer sb = new StringBuffer("abc");
		sb.append("defg");
		sb.append("defg");
		sb.append("defg");
		sb.append("defg");
		String d = sb.toString();
		
//		스레드에 안전하지않음. (Thread-unsafe)
//		StringBuffer보다 조금빠름.
		StringBuilder sbb = new StringBuilder("ABC");
		sbb.append("defg");
		String d2 = sbb.toString();
		
		
		
		
		
		
		
		
		
	}

}
