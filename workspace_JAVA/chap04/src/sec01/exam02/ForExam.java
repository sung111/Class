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
		
//		int sumsum=0;
//		for (int i = 1 ; i <= 100 ; i++) {
//			sumsum = sumsum+i;
//		}
//		System.out.println("1~100의 합 :" + sum2);
		
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
		
//		===============================
//		1~100까지 더하기
//		int sum2 = 0;
//		for(int e=1; e <= 100; e++) {
//				sum2 = sum2 +e;
//				System.out.println("e의 값 :" + e);
//				System.out.println("sum2 의 값 :" + sum2);
//		}
		
//		===============================
//		 10 에서부터 1 까지 출력하기
//		int nn;
//		for (nn = 10 ; nn > 0 ; nn--) {
//			System.out.println(nn);
//		}
		
//		===============================
//		1.1~20까지 짝수만 출력하기
		int nn2,nn3  ;
		for (nn2 = 0 ; nn2 <= 20 ; nn2++) {
			nn3 = nn2++;
			System.out.print(nn3+" ");
		}System.out.println(); 
		
		int mod,mod1;
		for (mod = 0 ; mod <= 20 ; mod++) {
			if(mod % 2 == 0) //2로나눠서 0이되야 짝수임.
				System.out.print(mod + " ");
		}System.out.println();
		
//		===============================
//		2.1~20까지 3의 배수만 출력하기
		int nn4,nn5,nn6;
		for (nn4 = 1 ; nn4*3 <= 20 ; nn4++) {
			nn5 = nn4 * 3;
			System.out.print(nn5 + " ");
		}System.out.println();
		
		
//		답 풀이
//		for (int qqq2 = 1; qqq2 <= 20 ; qqq2 += 3) {
//			if(qqq2 % 3==0) {
//				System.out.println(qq2);
//			}
//		}
		
//		===============================
//		3.1~5까지 모두출력하면서 홀/짝
//		1홀
//		2짝
		int ghf,ghf1,Wkr,Wkr1;
		for(Wkr = 0 ; Wkr*2 <= 20 ; Wkr++) {
			Wkr1 = Wkr * 2;
			System.out.print(Wkr1 + "(짝수)");
		}System.out.println();
		for(ghf = 0 ; ghf*2 < 20 ; ghf++) {
			ghf1 = ghf *2+1;
			System.out.print(ghf1 + "(홀수)");
		}System.out.println();
		
//		답풀이
//		for(int q3= 1; q3<5;q3++) {
//			if(q3%2==0) {
//				System.out.println(q3 + ": " + "짝수");
//			}else {
//				System.out.println(q3 + ": " + "홀수");
//			}
//		}
		
//		또는 좋은 줄여쓰기 예시
//		string ea = "홀수";
//		if(q3 % 2 ==0) {
//			ea = "짝수"
//		}System.out.println(q3 + ": " + ea);
		
//		===============================
//		4.1~20까지 홀수의합
		int fum,fum1,fount;
		fum1 = 0;
		for (fum=0 ; fum <= 20 ; fum++) {
			if(fum %2 == 1) {
				fum1 = fum1 + fum;
				System.out.print(fum1+ " ");
			}
		}System.out.println();
		System.out.print("홀수의합 :"+fum1);
		System.out.println();
		
//		답풀이
//		int summ4 = 0;
//		for(int q4 = 1; q4 <= 20; q4++) {
//			if (q4%2==1) {
//				summ4 += q4;
//			}
//		}System.out.println("summ4 :"+ summ4);
		
//		===============================
//		5.1~20까지 홀수의 개수
		int gkq,gkq1;
		gkq1 = 0;
		for (gkq = 1 ; gkq < 20 ; gkq++) {
			if(gkq % 2==1) {
				gkq1++;
			}
		}System.out.println(gkq1+"개");
		
//		답풀이
//		내 답과 똑같음
		
//		===============================
//		6.1~10까지 옆으로 3개씩 출력
		
//		답풀이
		for (int q=1; q<=10; q++) {
			System.out.print(q +" ");
			if (q % 3 == 0 ) {
				System.out.println();
			}
		}System.out.println();
//		답풀이와 반대
//		if (q % 3 != 0) {
//			System.out.print(q+" ");
//		} else {
//			System.out.print(q +"\n");
//		}
		
//		===============================
//		구구단
//		int m, n;
//		for (m = 1 ; m < 9 ; m++) {
//			System.out.println(m + "단");
//			for (n = 1 ; n < 9 ; n++) {
//				System.out.println(m + "*" + n + "=" + (m*n) );
//			}
//		}
		
//		구구단 2단
		
		int m;
		System.out.println("구구단 2단");
		for (m = 1 ; m < 10 ; m++) {
			System.out.println( "2 * " + m + " = " + ( 2 * m ) );
		}
		
	}

}
