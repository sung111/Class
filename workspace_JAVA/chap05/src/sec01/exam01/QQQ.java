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
//		------------------------------
//		답풀이
		System.out.println("3번문제 답풀이");
		int max5 = Integer.MIN_VALUE;
		System.out.println(max5);
		for(int i = 0 ; i <park.length; i++){
			if(max5 < park[i]) {
				max5 = park[i];
			}
		}
		System.out.println("답풀이 최댓값 :" + max5);
//		------------------------------
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
//		--------------------답풀이---------------------
		String[] arr2 = new String[8];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = ""+(int)(Math.random()*10);
		}
		// 출력
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
//		-----------------------------------------
		
		
		
//		 6-2. 영어 소문자로만 만들기.
//		int b1 = (int)(Rand * 26);
//		char[] b0 = new char[8];
//		for (int i = 0; i < b0.length; i++) {
//			double Rand = Math.random();
//			b0[i] = (char) (Rand * 26 + 'a');
//		}
		
		
//		--------------------답풀이---------------------

		for(int i=0; i<arr2.length; i++) {
			int start = 97;
			int end = 122;
			int random = ( (int)(Math.random()*(end - start + 1)) ) + start;
			char temp = (char)random;
			arr2[i] = ""+temp;
		}
		// 출력
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();		
//		-----------------------------------------

		
		
		
		
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
		
		
		
//		--------------------답풀이---------------------

		
//		int countNum = 0;
//		for(int i=0; i<arr2.length; i++) {
//			
//			// 0~2
//			// 0 : 숫자
//			// 1 : 소문자
//			// 2 : 대문자
//			int rand = ( (int)(Math.random()*(2 - 0 + 1)) ) + 0;
////			System.out.println(rand);
//			if(i > arr2.length-2) {
//				if(countNum < 2) {
//					rand = 0;
//				}
//			}
//			
//			String str = "";
//			
//			if(rand == 0) {
//				// 숫자
//				str = ""+(int)(Math.random()*10);
//				countNum++;
//			} else if(rand == 1) {
//				// 소문자
//				int start = 97;
//				int end = 122;
//				int random = ( (int)(Math.random()*(end - start + 1)) ) + start;
//				char temp = (char)random;
//				str = ""+temp;
//			} else {
//				// 대문자
//				int start = 65;
//				int end = 90;
//				int random = ( (int)(Math.random()*(end - start + 1)) ) + start;
//				char temp = (char)random;
//				str = ""+temp;
//			}
//			arr2[i] = str;
//		}
//		// 출력
//		for(int i=0; i<arr2.length; i++) {
//			System.out.print(arr2[i]);
//		}		
		
//		-----------------------------------------

		
		
		
		
		
		
		
		
		
		
		

//		7. 예약
//			자리가 10개있는 소극장 예약시스템
//			자리번호는 1~10번까지 번호의 자리가있음
//			만약 1 : 예약이 가능하다면 "n번자리 예약했습니다."
//			만약 2 : 예약이 불가능하다면 "이미 예약되어있습니다."
//			메뉴에는 1.예약 2.모든 좌석 현황 3.잔여좌석 4.종료
//		1 2 3 4 5 6 7 8 9 10

//								int[] whk = new int[10];
//								for (int i = 0; i < whk.length; i++) {
//									whk[i] = i + 1;
//								}
//						
//								Scanner T1 = new Scanner(System.in);
		// 변수를 넣어서 좌석을 이미 예약한거임.
		// 변수가 들어가지않는곳은 좌석예약이 가능함.
//		안이 ㅉ1발  이미들어가있는곳을 어떻게 예약완료로 말함?

//								while (true) {
//									System.out.println("-----------------------------");
//									System.out.println("|1.예약|2.좌석현황|3.잔여좌석|4.종료|");
//									System.out.println("-----------------------------");
//									System.out.print("메뉴를 선택해주세요~ :");
//									
//									int input = T1.nextInt();
//									
//									if (input == 1) {
//										System.out.println("----------------------");
//										System.out.println("|1|2|3|4|5|6|7|8|9|10|");
//										System.out.println("----------------------");
//										System.out.print("1~10번좌석을 선택해주세요 :");
//										input = T1.nextInt();
//										System.out.println();
//						
//										switch (input) {
//											case 1:
//											case 2:
//											case 3:
//											case 4:
//											case 5:
//											case 6:
//												System.out.println(input + "번 좌석은 이미 예약되었습니다.");
//												System.out.println("좌석을 확인후 다시 선택해주세요.");
//												break;
//											case 7:
//											case 8:
//											case 9:
//											case 10:
//												System.out.println(input + "번 좌석 예약되었습니다.");
//												break;
//											default:
//												System.out.println("다시선택해주세요.");
//											}
//									} else if (input == 2) {
//										System.out.println("현재 좌석 현황입니다.");
//										System.out.println("----------------------");
//										System.out.println("|1|2|3|4|5|6|7|8|9|10|");
//										System.out.println("----------------------");
//										continue;
//									} else if (input == 3) {
//										System.out.println("잔여좌석을 보여줌");
//										// 몇번몇번 남았습니다 를 어케말해줌? 씨봉방년들아
//						
//									} else if (input == 4) {
//										System.out.println("프로그램을 종료합니다.");
//										break;
//									} else {
//										System.out.println("제대로 선택해라.");
//									}
//								}
		
//		----------------답풀이-----------------
		System.out.println("-------------");
		int[] arr3 = new int[10];
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		do {
			System.out.println("1.예약, 2.모든좌석현황, 3.잔여좌석, 4. 종료");
			menu = scan.nextInt();
			if(menu == 1) {
				System.out.println("1~10까 중에 예약 자리를 입력하세요");
				int rsv = scan.nextInt();
				// 1~10까지 잘 넣었는지 방어
				
				if(arr3[rsv-1] == 1) {
					System.out.println("예약 불가");
				} else {
					arr3[rsv-1] = 1;
					System.out.println("자리번호 "+ rsv +" 예약 성공");
				}
			} else if(menu == 2) {
				for(int i=0; i<arr3.length; i++) {
					if(arr3[i] == 0) {
						System.out.println((i+1)+ "번 : 예약가능");
					} else {
						System.out.println((i+1)+ "번 : 예약불가");
					}
				}
			} else if(menu == 3) {
				System.out.print("예약 가능 좌석 : ");
				for(int i=0; i<arr3.length; i++) {
					if(arr3[i] == 0) {
						System.out.print((i+1)+ ",");
					}
				}
				System.out.println();
			} else {
				// 방어 코딩 필요(메뉴가 1~4가 아닌 경우)
				break;
			}
		} while(true);
		
//		---------------------------------
		
		
		
		
		
		
		
//		8.로또 6개 배열에 저장
//		단, 중복없이
		
		double lot = Math.random();
		int lott = (int)(lot* 45 +1);
		System.out.println(lott);
		
		
		
		
//		----------------답풀이-----------------

		int[] lotto = new int[6];
		boolean flag = false;
		for(int j=0; j<lotto.length; j++) {
			do {
				lotto[j] = (int)(Math.random()*(45)) + 1;
				flag = false;
				for(int i=0; i<j; i++) {
					if(lotto[i] == lotto[j]) {
						flag = true;
						System.out.println("중복발생");
						break;
					}
				}
			} while(flag);
		}
		System.out.println("--로또 번호--최민수--------------");
		for(int i=0; i<lotto.length; i++) {
			if(i != 0) {
				System.out.print(","+ lotto[i]);
			} else {
				System.out.print(lotto[i]);
			}
		}		
		
//		---------------------------------

		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] class1 = new int[20];
		int[] class2 = new int[20];
		int[] class3 = new int[20];
		int[] class4 = new int[20];
		
		int[][] 천안 = new int[4][20];
		System.out.println("천안 : "+ 천안);
		System.out.println("천안[0] : "+ 천안[0]);
		System.out.println("천안[0][0] : "+ 천안[0][0]);
		System.out.println(천안.length);
		
		//서로다른 크기를 가지는 2차원 배열
		int[][] test = {
					{1,2,3},
					{1,2,3, 4},
					{78}
					};
		System.out.println(test[1][3]);
		System.out.println("tets.length :" + test.length);
		System.out.println("tets[0].length :" + test[0].length);
		System.out.println("tets[1].length :" + test[1].length);
		System.out.println("tets[1].length :" + test[1].length);
		
//		int[][] 수원 = new int [4][20];
//		int[][] 서울 = new int [4][20];
		
//		int[][][] 휴먼 = new int[3][4][20]; 
		
		//가상 달력
		//총 12개월에 모든달은 30일로 고정
		//한달은 1~30
		//모든날짜를 채워넣기
		//따로 모든 or 11월 출력
		int[] month = new int [12];
		int[][] month1 = new int[12][30];
				
//		for(int i = 0 ; i < month.length; i++) {
//			
//		}
		for(int i = 0 ; i < month1.length; i++) {
			for(int j = 0; j < month1[i].length ; j++) {
				month1[i][j] = j + 1;
			}
		}
	
//		for(int i = 0 ; i < month.length ; i++) {  //월출력
//			System.out.println(month[i] + "월");
//		}
		for(int i = 1 ; i < month1.length ; i++) {
//			System.out.println(month[i] + "월");
			for(int j = 0; j < month1[i].length ; j++) {
//				System.out.println("i :" + (i +1) +", j :"+ month1[i][j]);
			}
		}
		

		//4개짜리 배열을 깊은복사
		
		String[] name1 = {"김", "이", "박", "최"};
		//name1과 정확히 동일한 name2를만드세요
//		String[] name2 = name1; 얕은복사 - 주소값만따옴
		String[] name2 = new String[name1.length];
		
		
		for(int i = 0 ; i < name1.length ; i++) {
			name2[i] = name1[i];
		}
		
		
		
		
		
		
	}

}
