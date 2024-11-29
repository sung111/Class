package sec01.exam02;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
//		가위바위보 문제
//		스캔으로 받아서 가위,바위,보 를 입력
//		컴퓨터는 랜덤으로 가위,바위,보를 뽑아 만들기

//		컴퓨터
		double com = (Math.random() * (3)) + 1;
		int com1 = (int) com;

//		나
		Scanner TTT = new Scanner(System.in);
		String na = TTT.nextLine();
		if (na.equals("가위")) {
			System.out.println("가위를냈다!");
			if (com1 == 1) {
				System.out.println("비겼습니다.");
			} else if (com1 == 2) {
				System.out.println("졌습니다.");
			} else if (com1 == 3) {
				System.out.println("이겼습니다.");
			}
		} else if (na.equals("바위")) {
			System.out.println("바위를냈다!");
			if (com1 == 1) {
				System.out.println("이겼습니다.");
			} else if (com1 == 2) {
				System.out.println("비겼습니다.");
			} else if (com1 == 3) {
				System.out.println("졌습니다.");
			}
		} else if (na.equals("보")) {
			System.out.println("보를냈다!");
			if (com1 == 1) {
				System.out.println("졌습니다.");
			} else if (com1 == 2) {
				System.out.println("이겼습니다.");
			} else if (com1 == 3) {
				System.out.println("비겼습니다.");
			}
		}
		if (com1 == 1) {
			System.out.println("컴퓨터 : 가위");
		} else if (com1 == 2) {
			System.out.println("컴퓨터 : 바위");
		} else {
			System.out.println("컴퓨터 : 보");
		}

	}

}
 
