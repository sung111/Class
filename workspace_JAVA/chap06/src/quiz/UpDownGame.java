package quiz;

import java.util.Scanner;

public class UpDownGame {
	
	Scanner ss = new Scanner(System.in); //스캐너 객체생성
	int a = (int)(Math.random()*10+1);  //랜덤
	int s1;
	
	
	void start() {
		System.out.println("게임을시작합니다.");
		System.out.println("1~10까지의 정수를입력하세요");
		System.out.println("3번의 기회가 주어집니다.");
		System.out.println("11을 입력시 정답이 주어집니다.");
		this.repeat();
	}
	
	
	int input() {
		s1 = ss.nextInt();
		return s1;
	}
	
	
	void repeat() {
		for(int i = 0; i < 3 ; i++) {
			this.input();
			if(s1 == 11) {
				System.out.println(a);
				break;
			} else if(s1 == a) {
				System.out.println("정답입니다.");
				System.out.println("ㅊㅋㅊㅋ");
				break;
			} else if(s1 < a) {
				System.out.println("Up");
			} else if(s1 > a) {
				System.out.println("Down");
			} else {
				System.out.println("1~10까지 입력하세요.");
			}
		}
	}
	
	
	
	
	
	
	
}
