package sec01.exam01;

public class ArrayExam {

	public static void main(String[] args) {

		// 배열
		// 한번에 여러변수를 만드는방법
		// 같은 타입만 선언할수 있음
		// 생성할때 전체 크기를 지정해줘야됨
		// 생성된 여러변수들은 index로 관리함.

		int[] score; // java 스타일
		int score2[]; // C스타일

		// 변수앞이 무조건 타입이라고 읽는 경우
		// score변수는 "int로 구성된 배열이다."

		// 배열은 참조타입
		score = null;

		int score_0 = 90;
		int score_1 = 60;
		int score_2 = 70;

//		int[] intArray = new int[3];
//		intArray[0] = 90;
//		​
//		배열을 생성할때 크기를 알려줘야 합니다.
//		첫번째 [ ] (int[]) : int로 이루어진 배열이다
//		두번째 [ ] (new int[3]) : 배열의 크기, 즉 한번에 만들 변수의 개수
//								타입의 크기만큼 연달아서 메모리를 할당
//								첫번째 주소를 변수에 저장
//								index  0 부터 시작한다
//		세번째 [ ] (intArray[0]) : 만들어진 변수 중에서 첫번째 변수를 뜻함

		int[] intArray = new int[3];
		intArray[0] = 90;
		intArray[1] = 60;
		intArray[2] = 70;

		System.out.println("intArray[0] :" + intArray[0]);
		System.out.println("intArray[2] :" + intArray[2]);

//		java.lang.ArrayIndexOutOfBoundsException
//		배열의 범위를 벗어남.
//		System.out.println("intArray[3] :" + intArray[3]);

//		선언하는 두번째 방법
//		넣을 값으 모두 정확히 알고있는경우
		int[] intArray2 = new int[] { 90, (int) Math.random(), 70 };

		int[] intArray2_1 = null;
		intArray2_1 = new int[] { 90, (int) Math.random(), 70 };

//		선언하는 세번째 방법

		int[] intArray3 = { 90, (int) Math.random(), 70 };

//		new int[]에 해당하는걸 생략가능
//		선언과 동시에 초기화 하는 경우에만 사용 가능

		System.out.println("intArray3의 길이 : " + intArray3.length);
		System.out.println("intArray3 : " + intArray3);

		String[] sArr = new String[14];
//		sArr[0] = "이름1"; 

		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = "이름" + (i+1);
		}
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
//		1~10 까지 배열에 넣고배열의
//		총합 출력
//		배열의 평균값 출력
		
		int[] wjd = new int[10];
		int a=0;
		for(int i = 0; i < wjd.length; i++) {
			wjd[i] += i +1;
		}
		for(int i = 0; i < wjd.length; i++) {
			a = a + wjd[i];
			System.out.println(wjd[i]);
		} System.out.println(a);
		
		double avr = a / (double)(wjd.length);
		System.out.println(avr);  //평균 출력
		
		
//		퀴즈
		for(int i = wjd.length-1 ; i >= 0 ; i--) {
			System.out.println(wjd[i]);
		}
//		출력문에서 빼서 10부터 출력하는 방법.
		for(int i = 0 ; i >= wjd.length ; i++) {
			System.out.println(wjd[wjd.length-1-i]);
		}
		

		
		
		
		
		
		
		

	}

}
