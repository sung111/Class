package sec01.exam01;

public class QQQ {

	public static void main(String[] args) {

		




//		[3,4,7,5,1,4,6]
		
//		1.홀수의 갯수구하기
		int[] park = {3,4,7,5,1,4,6};
		int a= 0;
		int b= 0;
		for (int i = 0 ; i < park.length ; i++) {  //홀의갯수구하기
			if(park[i] % 2 == 1) {
				a += 1;
			}
		}System.out.println("홀의 개수 : " + a + "개");
		System.out.println();
		
//		2.4보다 큰 수의 갯수를 구하기
		for(int i = 0 ; i < park.length ; i++) {
			if(park[i] > 4) {
				b += 1;
			}
		}System.out.println("4보다 큰수 의 개수 : " + b + "개");
		
		
//		3.가장큰값을 구하시오
		int min = 2100000000;
		int max = 0;
		
		for(int i = 0; i < park.length ; i++ ) {
			if(park[i] >= max){
				max = park[i];
			}
			if(park[i] <= min) {
				min = park[i];
			}
			
		}System.out.println();
		System.out.println("제시한 배열중 가장 큰값 : " + max);
		System.out.println("제시한 배열중 가장 작은값 : " + min);
		System.out.println();
		
		int max2 = 0;
//		[3,4,7,5,1,4,6]
//		4.두번째 큰수 구하기
//		max보다 작으면서 배열에서 큰값.
		for(int i = 0; i < park.length ; i++ ) {
			//max 미만이면서 && max 2보다 큰 숫자를 대입 
			if (park[i] < max && park[i] > min){
				max2 = park[i];
			}
		}System.out.println("두번째로 큰 값 :" +max2);
		
		
		int[] arr = {0,1,2,3,4};
//		5.배열을 하나씩 뒤로(오른쪽으로) 밀기
//		 5-1 빠진자리는 0으로 채우기
//		 5-2 첫자리에 마지막 숫자 넣기
		int temp;
//		temp = arr[4];
//		arr[4] = arr[3];
//		arr[3] = arr[2];
//		arr[2] = arr[1];
//		arr[1] = arr[0];
//		arr[0] = temp;
		//증감식 i의 값이 i+1 에게 값을줌
		//어케주노 ?
//		temp = arr[5];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = arr[i];
		}
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
//		6. 임시비밀번호 8자리 만들기 (랜덤?)
//		 6-1. 숫자로만 만들기
//		 6-2. 영어 소문자로만 만들기.
//		 *6-3. 숫자 두개이상, 대소문자 조합
		
		
		
//		7. 예약
//			자리가 10개있는 소극장 예약시스템
//			자리번호는 1~10번까지 번호의 자리가있음
//			만약 1 : 예약이 가능하다면 "n번자리 예약했습니다."
//			만약 2 : 예약이 불가능하다면 "이미 예약되어있습니다."
//			메뉴에는 1.예약 2.모든 좌석 현황 3.잔여좌석 4.종료
		
//		8.로또 6개 배열에 저장
//		단, 중복없이
		
		
		
		
		
	}

}
