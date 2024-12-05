package sec01.exam01;

import java.util.Scanner;

public class QQQ {

	public static void main(String[] args) {

//		[3,4,7,5,1,4,6]

//		1.홀수의 갯수구하기
		int[] park = { 3, 4, 7, 5, 1, 4, 6 };
		int a = 0;
		int b = 0;
		for (int i = 0; i < park.length; i++) { // 홀의갯수구하기
			if (park[i] % 2 == 1) {
				a += 1;
			}
		}
		System.out.println("홀의 개수 : " + a + "개");
		System.out.println();

//		2.4보다 큰 수의 갯수를 구하기
		for (int i = 0; i < park.length; i++) {
			if (park[i] > 4) {
				b += 1;
			}
		}
		System.out.println("4보다 큰수 의 개수 : " + b + "개");

//		3.가장큰값을 구하시오
		int min = 2100000000;
		int max = 0;

		for (int i = 0; i < park.length; i++) {
			if (park[i] >= max) {
				max = park[i];
			}
			if (park[i] <= min) {
				min = park[i];
			}

		}
		System.out.println();
		System.out.println("제시한 배열중 가장 큰값 : " + max);
		System.out.println("제시한 배열중 가장 작은값 : " + min);
		System.out.println();

		int max2 = 0;
//		[3,4,7,5,1,4,6]
//		4.두번째 큰수 구하기
//		max보다 작으면서 배열에서 큰값.
		for (int i = 0; i < park.length; i++) {
			// max 미만이면서 && max 2보다 큰 숫자를 대입
			if (park[i] < max && park[i] > min) {
				max2 = park[i];
			}
		}
		System.out.println("두번째로 큰 값 :" + max2);

//		5.배열을 하나씩 뒤로(오른쪽으로) 밀기
//		 5-1 빠진자리는 0으로 채우기
//		 5-2 첫자리에 마지막 숫자 넣기
		int[] arr = { 0, 1, 2, 3, 4 };
		int temp;
//		temp = arr[4];
//		arr[4] = arr[3];
//		arr[3] = arr[2];
//		arr[2] = arr[1];
//		arr[1] = arr[0];
//		arr[0] = temp;
		// 증감식 i의 값이 i+1 에게 값을줌
		// 어케주노 ?
//		temp = arr[5];
//		temp = arr[0];								// 첫번째 숫자를 temp에 저장.
//													//처음시작하는곳에대입		//얘는 4임
//		arr[0] = arr[arr.length-1];
//		
//						//3
//		for(int i = arr.length-2 ; i >= 0 ; i--) {
//			arr[i+1] = arr[i];          			//밀려면 앞에숫자를 그바로뒤 숫자로 대입을 시켜줘야되니까 앞 배열에 [i+1]
//		}   
//		 
//		arr[1] = temp;								//다밀고 맨뒤를 앞으로 넣으면 저장했던숫자를 배열 1에 넣어벌임
//		for(int i = 0 ; i < arr.length ; i++) {
//			System.out.print(arr[i]);
//		}System.out.println();
//		System.out.println(arr[arr.length-1]);  
//		arr.length -1 하는이유 4뒤에 5앞에 주소를 가르켜서 4를출력하려면 최대길이에 -1을 출력해야됨

//		-----------------------------------------------
		int temp1 = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = temp1;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
//		-----------------------------------------------

//		6. 임시비밀번호 8자리 만들기 (랜덤?)
//		double randa = Math.random();
//		double randb = Math.random();

//		int a = (int)(randa * 9 +1);
//		int b = (int)(randb * 9 +1);

//		System.out.println(a);
//		System.out.println(b);

//		 6-1. 숫자로만 만들기
		int[] t = new int[8];
		for (int i = 0; i <= t.length - 1; i++) {
			double rand = Math.random();
			t[i] = (int) (rand * 9 + 1);
			System.out.print(t[i]);
		}
		System.out.println();

//		 6-2. 영어 소문자로만 만들기.
//		int b1 = (int)(Rand * 26);
//		char[] b0 = new char[8];
//		for (int i = 0; i < b0.length; i++) {
//			double Rand = Math.random();
//			b0[i] = (char) (Rand * 26 + 'a');
//		}
//		System.out.println(b0);
		// + 'a': 'a'의 아스키 코드 값은 97입니다. 0부터 25 사이의 값을 'a'에 더하면,
		// 아스키 코드 값 97부터 122 사이의 값이 됩니다. 이는 각각 소문자 알파벳 'a'부터 'z'까지에 해당합니다.
		// 만약 'a'를 더하지 않으면, 생성된 값은 'a'부터 시작하는 소문자가 아니라 다른 범위의 문자가 될 수 있습니다.

//		 *6-3. 숫자 두개이상, 대소문자 조합
//      아스키 48~57까지 숫자 + 65~90까지 대문자 + 97~122까지 소문자
		char[] c0 = new char[9];
//		char[] c1 = new char[3];
//		char[] c2 = new char[3];
		for (int i = 0; i < c0.length; i++) {
			if (i % 4 == 0) {
				double dom = Math.random();
				c0[i] = (char) (dom * 26 + 'A');
				continue;
			}
			if (i % 2 == 1) {
				double rand1 = Math.random();
				c0[i] = (char) (rand1 * 26 + 'a');
				continue;
			}
			if (i % 2 == 0) {
				double Tt = Math.random();
				c0[i] = (char) (Tt * 9 + '1');
				continue;
			} else {
				double rand2 = Math.random();
				c0[i] = (char) (rand2 * 26 + 'A');
				continue;
			}
		}
		System.out.println(c0);

//		7. 예약
//			자리가 10개있는 소극장 예약시스템
//			자리번호는 1~10번까지 번호의 자리가있음
//			만약 1 : 예약이 가능하다면 "n번자리 예약했습니다."
//			만약 2 : 예약이 불가능하다면 "이미 예약되어있습니다."
//			메뉴에는 1.예약 2.모든 좌석 현황 3.잔여좌석 4.종료
//		1 2 3 4 5 6 7 8 9 10

		int[] whk = new int[10];
		for (int i = 0; i < whk.length; i++) {
			whk[i] = i + 1;
		}

		Scanner T1 = new Scanner(System.in);
		// 변수를 넣어서 좌석을 이미 예약한거임.
		// 변수가 들어가지않는곳은 좌석예약이 가능함.
//		안이 씨발  이미들어가있는곳을 어떻게 예약완료로 말함?씨발롬아

		while (true) {
			System.out.println("-----------------------------");
			System.out.println("|1.예약|2.좌석현황|3.잔여좌석|4.종료|");
			System.out.println("-----------------------------");
			System.out.print("메뉴를 선택해주세요~ :");
			
			int input = T1.nextInt();
			
			if (input == 1) {
				System.out.println("----------------------");
				System.out.println("|1|2|3|4|5|6|7|8|9|10|");
				System.out.println("----------------------");
				System.out.print("1~10번좌석을 선택해주세요 :");
				input = T1.nextInt();
				System.out.println();

				switch (input) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
						System.out.println(input + "번 좌석은 이미 예약되었습니다.");
						System.out.println("좌석을 확인후 다시 선택해주세요.");
						break;
					case 7:
					case 8:
					case 9:
					case 10:
						System.out.println(input + "번 좌석 예약되었습니다.");
						break;
					default:
						System.out.println("다시선택해주세요.");
					}
			} else if (input == 2) {
				System.out.println("현재 좌석 현황입니다.");
				System.out.println("----------------------");
				System.out.println("|1|2|3|4|5|6|7|8|9|10|");
				System.out.println("----------------------");
				continue;
			} else if (input == 3) {
				System.out.println("잔여좌석을 보여줌");
				// 몇번몇번 남았습니다 를 어케말해줌? 씨봉방년들아

			} else if (input == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("제대로 선택해라.");
			}
		}
		
//		8.로또 6개 배열에 저장
//		단, 중복없이
		
		double lot = Math.random();
		int lott = (int)(lot* 45 +1);
		System.out.println(lott);
		
		
		
		
		

	}

}
