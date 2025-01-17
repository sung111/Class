package quiz;

public class Gugudan {
//	클래스를 만든다

//	숫자를넣었을때 그 단 출력
	void gu(int t) {
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(t + "x" +  i + "=" + t*i);
		}
	}
	
	
	void yeah(int t,int s) {
		if(t > 1 && t < 10) {
			for(int i = t ; i <= s ; i++) {
				System.out.println(i+"단");
				gu(i);
			}
		} else {
			System.out.println("2~9까지의 정수를 넣어주세요");
		}	
	}
	void yeah(int t) {
//		for(int i = t ; i <= 9 ; i++) {
//			System.out.println(i+"단");
//			gu(i);
//		}
		yeah(t,9);
	}
	
	
}
