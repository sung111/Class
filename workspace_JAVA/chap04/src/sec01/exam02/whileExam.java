package sec01.exam02;

import java.util.Scanner;

public class whileExam {

	public static void main(String[] args) {
		
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1: 커피, 2: 홍차, 0:종료");
//		Scanner scan = new Scanner(System.in);
//		int menu = scan.nextInt();
		
//		if (menu == 1) {
//			System.out.println("커피드릴게요.");
//		}else if (menu == 2) {
//			System.out.println("홍차드릴게요.");
//		}else if (menu == 0) {
//			System.out.println("다음에또오세요.");
//		}else  {
//			System.out.println("메뉴에서 고르세요.");
//		}
//		
//		
//		if (menu != 0) {
//			if (menu == 1) {
//				System.out.println("커피드릴게요.");
//			}else if (menu == 2) {
//				System.out.println("홍차드릴게요.");
//			}else  {
//				System.out.println("메뉴에서 고르세요.");
//			}
//			
//			int menu = scan.nextInt();
//			if (menu == 1) {
//				System.out.println("커피드릴게요.");
//			}else if (menu == 2) {
//				System.out.println("홍차드릴게요.");
//			}else  {
//				System.out.println("메뉴에서 고르세요.");
//			}
//		} 
//		else  {
//			System.out.println("다음에또오세요.");
//		}
		
		Scanner scan = new Scanner(System.in);
//		int menu = scan.nextInt();
		
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1: 커피, 2: 홍차, 0:종료");
//		while (menu != 0) {
//			if (menu == 1) {
//				System.out.println("커피드릴게요.");
//			}else if (menu == 2) {
//				System.out.println("홍차드릴게요.");
//			}else  {
//				System.out.println("메뉴에서 고르세요.");
//			}
//			
//			System.out.println("메뉴를 고르세요");
//			System.out.println("1: 커피, 2: 홍차, 0:종료");
//			menu = scan.nextInt();
//		}System.out.println("다음에또오세요.");
		
//		몇번반복할지 모를때 while
//		몇번반복할지 알때 for
		
		String m = "";
		do {
			System.out.println("메뉴를 고르세요");
			System.out.println("1: 커피, 2:홍차, x: 종료");
			m = scan.nextLine();
			if (m.equals("1")) {
				System.out.println("커피드릴게요.");
			}else if (m.equals("2")) {
				System.out.println("홍차드릴게요.");
			}
		} while (!m.equals("x"));
		System.out.println("다음에또오세요.");
		
		
		
		
		
		
		
		
		
	}

}
