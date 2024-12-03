package sec01.exam02;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {

		
		int b=0;
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			b += 1;
			if(num == 6) {
				break;
			}
		}System.out.println("게임종료");
		System.out.println("총" + (b -1) + "번 실행했습니다." );
		
//		for(int i=0; i<5; i++) {
//			System.out.println("i : "+ i);
//			for (int j=0; j<3; j++) {
//				System.out.println("j : " + j);
//				if (j>=2) {
//					break;
//				}System.out.println("j : " + j);
//			}System.out.println();
//		}System.out.println();System.out.println();
		
		
		boolean isStop = false;
		for(int k=0; k<5; k++) {
			System.out.println("k : "+ k);
			for (int l=0; l<3; l++) {
				System.out.println("j : " + l);
				if (k>=1) {
					isStop = true;
					break;
				}System.out.println("j : " + l);
				
			}
			if (isStop) {
				break;
			}System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			if (i % 2 ==0) {  //짝수
				System.out.println(i);
			}
		}
		
		for(int i=1; i<=10; i++) {
			if (i % 2 ==0) {  //홀수
				continue;
			}System.out.println(i);
		}
		
//		예금
//		예금액이 음수불가
		
//		출금
//		출금액이 음수불가
//		잔고보다 큰 금액 불가
		
		
		Scanner scan = new Scanner(System.in);
		
		int a = 10000;
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("|1.예금 | 2.출금 | 3.잔고 | 4.종료|");
			System.out.println("-------------------------------");
			System.out.print("입력 :");
			int input = scan.nextInt();
			System.out.println();
			if(input == 1) {
				System.out.print("입금액을 입력하세요 :");
				input = scan.nextInt();
				System.out.println();
				if(input > 0) {
					a = a + input;
					System.out.println("잔액은 :" + a + "원 입니다.");
					break;
				}else {
					System.out.println("양수를 입력해주세요.");
				}
				
			}	
			else if(input == 2) {
				System.out.print("출금액을 입력하세요 :");
				input = scan.nextInt();
				System.out.println();
				
					if(input > 0) {
						a = a - input;
						System.out.println("잔액은 :" + a + "원 입니다.");
						break;
					} else {
						System.out.println("양수를 입력해주세요.");
					}
				
			}
			else if (input == 3) {
				System.out.println("잔액은 :" + a + "원 입니다.");
				break;
			}
			else if(input == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("메뉴 안에서 정해주세요.");
			}
		}
		
		
		
		
		
		
		
		
	}

}
