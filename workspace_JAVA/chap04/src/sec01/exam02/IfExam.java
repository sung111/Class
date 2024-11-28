package sec01.exam02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {

		int score = 73;
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("90점 이상입니다.");
			System.out.println("등급 A");
		} else if (score < 90 && score >= 80) {
			System.out.println("80~89점 입니다.");
			System.out.println("등급 B");
		} else if (score < 80 && score >= 70) {
			System.out.println("70~79점 입니다.");
			System.out.println("등급 C");
		} else {
			System.out.println("70점 미만입니다.");
			System.out.println("등급 D");
		}
		
//		문제 1
//		z1 이 x1과 y1사이에있는확인
		
		int x1, y1, z1;
		x1 = 15;
		y1 = 20;
		z1 = 17;
		
		if (z1 >= x1) {
			if (z1 <= y1) {
				System.out.println("z1이 x1과 y1 사이입니다.");
			}
		}
		if (z1 <= x1) {
			if (z1 >= y1) {
				System.out.println("z1이 x1과 y1 사이입니다.");
			}
		}
		
		int x2 = 3;
		if ( x2 % 2 == 0 ) {
			System.out.println("짝수입니다.");
		} else
			{ System.out.println("홀수입니다.");
			}
//		Scanner scan[←스캐너 변수명] = new Scanner(System.in);
//		int score [←입력받은 정수 변수명]= scan.nextInt();
//		문제 2
//		어제온도가 -3도였을때
//		1오늘 온도가 영하 인지 영상인지 출력
//		
//		2만약 영하라면 "영하 1도 입니다." 출력
//		
//		3어제보다 온도가 높거나 낮은지 출력
//		
//		4어제보다 몇도 높은지 출력
		int t = -1; //오늘온도
		int yt = -3; //어제온도
		
		if( t <= 0 ) {
			System.out.println("\n영하이며.");
			System.out.println("영하" + t + "도 입니다.");
		} else {
			System.out.println("\n영상이며.");
			System.out.println("영상" + t + "도 입니다.");
		}
		if ( yt > t ) {
			System.out.println("어제보다 온도가 낮습니다.");
			System.out.println("어제보다"+ (t - yt) +"도 낮습니다.");
		} else {
			System.out.println("어제보다 온도가 높습니다.");
			System.out.println("어제보다"+ (t - yt) +"도 높습니다.");
		}
		
		
//		문제3
//		입력한 수는 100보다 큰/같은/작은 수이며 양수이고 홀수입니다.
		int t1 = 87;
		if (100 > t1 ) {
			System.out.println("100보다 작습니다.");
			if (t1 % 2 == 0) {
				System.out.println("그리고 짝수입니다.");
			} else {
				System.out.println("그리고 홀수입니다.");
			}
		} else if ( 100 < t1 ) {
			System.out.println("100보다 큽니다.");
			if (t1 % 2 == 0) {
				System.out.println("그리고 짝수입니다.");
			} else {
				System.out.println("그리고 홀수입니다.");
			}
		} else {
			System.out.println("100과 같습니다.");
		}
//		문제 4
//		a,b 두 수가 있을때 둘중에 큰값출력
		int AA = 1;
		int BB = 2;
		if(AA > BB) {
			System.out.println(AA);
		} else if(BB > AA) {
			System.out.println(BB);
		} else {
			System.out.println("값이 같습니다.");
		}
		
//		===================
//		문제 5
//		숫자가 1일때 "일"
//		숫자가 2일때 "이"
//		숫자가 3일때 "삼" 다른수일때 "그외"
		
//		Scanner cc = new Scanner(System.in);
//		int ccc = cc.nextInt();
//		if (ccc == 1) {
//			System.out.println("일");
//		} else if (ccc== 2) {
//			System.out.println("이");
//		} else if (ccc == 3){
//			System.out.println("삼");
//		} else {
//			System.out.println("그외");
//		}
		
//		====================
//		문제 6
//		월을 입력받고 월에따라서 4계절을 출력해라
		
//		Scanner scan = new Scanner(System.in);
//		int dnjf = scan.nextInt();
//		
//		if (dnjf >= 3 && dnjf <= 5) {
//			System.out.println("봄");
//		} else if (dnjf >= 6 && dnjf <= 8) {
//			System.out.println("여름");
//		} else if (dnjf >= 9 && dnjf <= 11) {
//			System.out.println("가을");
//		} else {
//			System.out.println("겨울");
//		}
		
		
//		=================
		//문제
		//두자리 정수
//		10의 자리와 1의자리가 같은지 판단
//		Scanner wkfl1 = new Scanner(System.in);
//		int wkfl = wkfl1.nextInt();
		
		int wkfl = 55;
		if ((double)wkfl / (wkfl/10) == 11) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
//		어려운문제
//		사각형의 한쪽 모서리 : 10,20
//		다른쪽모서리 : 90, 100
//		새로운 점 : xc, yc가 사각형에 포함 되는가?
		
//		XYZ
		int xa, ya, xb, yb, xg, yg;
		xa = 10;
		ya = 20;
		xb = 90;
		yb = 100;
		xg = 50;
		yg = 40;
		if ((xg >= xa && xg <= xb) && (yg >= ya && yg <= yb)) {
			System.out.println("들어감");
		} else System.out.println("안드감");
		
		System.out.println(
				(xg >= xa && xg <= xb) && (yg >= ya && yg <= yb)
			);
//		System.out.println(xg >= xa && xg <= xb);
		
		
		
//		주사위 : 0~5
		
		double rand = Math.random();
		System.out.println((rand * 5)+1);
		
		double rand2 = Math.random() * (5+1);
		int rand3 = (int)rand2; //0~5
		int rand4 = rand3 + 1; //1~6
		System.out.println("주사위 : " + (rand4));
		
//		쉽게쓰기
		int rnd1 = (int) (Math.random() * 60);
		int rnd2 = rnd1 % 6;
		int rnd3 = rnd2 + 1;
		System.out.println(rnd3);
		

		
		
		
		
		
		
		
		
		
	}

}
