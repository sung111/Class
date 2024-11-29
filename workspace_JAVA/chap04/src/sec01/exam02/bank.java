package sec01.exam02;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		int atm = 10000;
		Scanner scan = new Scanner(System.in);
		System.out.print("입금 : 1, 출금 : 2 -> 선택하세요");
		int select = scan.nextInt();
		System.out.print("금액을 입력하세요 :");
		int input = scan.nextInt();
		
		
		if ( select == 1 ){
			if (input > 0 ) {
				atm = atm + input;
				System.out.println( input + "원 입금되었습니다.\n잔액은" + atm + "원 남았습니다." );
			} else if (input <= 0) {
				System.out.println("정확히 입력해주세요.");
			} 
		}
		if ( select == 2 ){
			if (input > atm ) {
				System.out.println("잔액이부족합니다.");
			} else if (input <= 0) {
				System.out.println("정확히 입력해주세요.");
			} else {
				atm = atm - input;
				System.out.println(input + "원 을 출금하고," + atm + "원 남았습니다.");
			}
		}
	}

}
