package sec01.exam02;

public class ForExam {

	public static void main(String[] args) {

//		1씩증가하는것을 5번하고싶다.
//		int sum2 = 0;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
//		System.out.println("sum :" + sum);
		
		int sum1 = 0;
		sum1 = sum1 + 1;
		sum1 = sum1 + 2;
		sum1 = sum1 + 3;
		sum1 = sum1 + 4;
		sum1 = sum1 + 5;
		System.out.println("sum1 :" + sum1);
		
		int sum2 = 0;
		for (int i = 1 ; i <= 100 ; i++) {
			sum2 = sum2 +i;
		}
		System.out.println("1~100의 합 :" + sum2);
		
//		반복문 을 만드는 원리
//		복붙을 했을때 바뀌지않는것
//		
//		반복 되지않는 것 찾기
//		규칙 을 찾을수 있으면 반복문으로 만들수있음
//		변수를 활용해서 더이상 바뀌지않게 만들기
//		
//		시작조건
//		종료조건
//		for : 반복횟수를 아는경우
//		while : 반복 횟수를 모르는 경우
	}

}
