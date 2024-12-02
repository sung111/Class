package sec01.exam02;

import java.util.Scanner;

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
//		for (int q=1; q<=10; q++) {
//			System.out.print(q +" ");
//			if (q % 3 == 0 ) {
//				System.out.println();
//			}
//		}System.out.println();
		
//		답풀이와 반대
//		if (q % 3 != 0) {
//			System.out.print(q+" ");
//		} else {
//			System.out.print(q +"\n");
//		}
		
//		===============================
//		구구단
//		int m, n;
//		for (m = 2 ; m <= 9 ; m++) {
//			System.out.println();
//			System.out.println(m + "단");
//			for (n = 1 ; n <= 9 ; n++) {
//				System.out.print("  " + m + "*" + n + "=" + (m*n) );
//			}
//		}
		
//		2,3단 한줄 4,5단 한줄 ...~ 문제풀이
		int k=1;
		int m=2;
		System.out.println(m + "x" + k + "=" + (m*k) + " " +(m+1) + "x" + k + "=" + ((m+1)*k) +" ");
//		=============
		for(int k2=1 ; k2<=9 ; k2++) {
			System.out.println(m + "x" + k2 + "=" + (m*k2) + " " +(m+1) + "x" + k2 + "=" + ((m+1)*k2) +" ");
		}
		System.out.println();
		m+=2;
		for(int k2=1 ; k2<=9 ; k2++) {
			System.out.println(m + "x" + k2 + "=" + (m*k2) + " " +(m+1) + "x" + k2 + "=" + ((m+1)*k2) +" ");
		}
		m+=2;
		for(int k2=1 ; k2<=9 ; k2++) {
			System.out.println(m + "x" + k2 + "=" + (m*k2) + " " +(m+1) + "x" + k2 + "=" + ((m+1)*k2) +" ");
		}
		m+=2;
		for(int k2=1 ; k2<=9 ; k2++) {
			System.out.println(m + "x" + k2 + "=" + (m*k2) + " " +(m+1) + "x" + k2 + "=" + ((m+1)*k2) +" ");
		}
		System.out.println("========2단씩출력========");
		for(int p=0; p<=9;p+=2) {
			for(int k2=1 ; k2<=9 ; k2++) {
				System.out.println(p + "x" + k2 + "=" + (p*k2) + " " +(p+1) + "x" + k2 + "=" + ((p+1)*k2) +" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
//		풀다 못품
//    	int m9, n9;
//    	for (m9 = 2 ; m9 <= 9 ; m9++) {
//    	System.out.print(m9 + "단\t"); //옆으로 단출력
//    	
//    		if (m9 % 2 == 1) {
//    			System.out.println(); //홀수일때 엔터
//    			for (n9 = 0 ; n9 <= 9; n9++) {
//    				System.out.println(m9 + "*" + n9 + "=" + m9*n9);
//    			}
//    		}
//    	}

//        gpt
//        for (m9 = 2; m9 <= 9; m9 += 2) {
//            for (int M8 = 0; M8 < 2 && m9 + M8 <= 9; M8++) {
//                int N8 = m9 + M8;
//                System.out.print(N8 + "단\t");
//            }
//            System.out.println();
//            for (n9 = 1; n9 <= 9; n9++) {
//                for (int M8 = 0; M8 < 2 && m9 + M8 <= 9; M8++) {
//                    int N8 = m9 + M8;
//                    System.out.print(N8 + "*" + n9 + "=" + (N8 * n9) + "\t");
//                }
//                System.out.println();
//            }
//        }
        
		
//		구구단 2단
//		답 풀이
//		int m;
//		System.out.println("구구단 2단");
//		for (m = 1 ; m < 10 ; m++) {
//			System.out.println( "2 * " + m + " = " + ( 2 * m ) );
//		}
		
//		1부터 n까지 숫자의 짝수의 합을 구하기
//		System.out.print("정수의 숫자를 입력하세요 : ");
//		Scanner nN = new Scanner(System.in); 
//		int nNn = nN.nextInt();
//		int q00 = 0;
//		for (int q0 = 0; q0 <= nNn; q0++) {
//			if ( q0 % 2 == 0) {
//			q00 += q0;
//			}
//		} System.out.println(q00);
		
//		1부터 n까지 숫자의 합을 구하기
//		int q00 = 0;
//		for (int q0 = 0; q0 <= nNn; q0++) {
//			q00 += q0;
//		} System.out.println(q00);
//		
		
		
		
		//1단계
		for(int tree=0; tree <= 5; tree++) {
			System.out.print("+");
		}System.out.println();System.out.println();
		
		//2단계
		for(int tree1 = 0; tree1 <3; tree1++) {
			System.out.println("+++++");
		}System.out.println();System.out.println();
		//3단계
		for(int tree2 = 0; tree2 <5 ; tree2++) {
			System.out.print(" "+ "+ ");
		}System.out.println();System.out.println();
		//4단계
		for (int tree3 = 1; tree3<6; tree3++) {
			for(int tree4 = 1; tree4 <= tree3; tree4++) {
				System.out.print("+");
			}System.out.println();
		}System.out.println();
		
		//5단계
		for (int tree5 = 1; tree5 < 6 ; tree5++) {
			for (int tree6 = 1 ; tree6 <= tree5 ; tree6++) {
				System.out.print("+");
			}
			for (int tree7 = 5; tree7 > tree5 ;tree7-- ) {
				System.out.print("_");
			}System.out.println();
		}
		
		//6단계
		for(int tree8 = 1; tree8 < 6; tree8++) {
			for (int tree9 = 5 ; tree9 > tree8; tree9--) {
				System.out.print("_");
			}
			for(int tree10= 1 ; tree10 <= tree8; tree10++) {
				System.out.print("+");
			}System.out.println();
		}
		
		//7단계
		
		for (int tree11 = 1 ; tree11 < 10 ; tree11++) {
			for(int tree12 = 10; tree12 > tree11 ; tree12--) {
				System.out.print("-");
			}
			for(int tree13=1; tree13 < tree11; tree13++) {
				System.out.print("+");
			}
			for(int tree14 = 1; tree14 < tree11 ; tree14++) {
				System.out.print("+");
			}System.out.println();
		}
		System.out.println();System.out.println();
		//8단계
		for (int tree15 = 1 ; tree15 < 10 ; tree15++) {
			for(int tree16 = 10; tree16 > tree15 ; tree16--) {//왼쪽
				System.out.print("-");
			}
			for(int tree17=1; tree17 < tree15; tree17++) { //반왼쪽
				System.out.print("+");
			}
			for(int tree18 = 0; tree18 < tree15 ; tree18++) {//반오른쪽
				System.out.print("+");
			}
			for(int tree19 = 10; tree19 > tree15 ; tree19--) {//오른쪽
				System.out.print("-");
			}System.out.println();
		}
		
		
		//9단계
		Scanner treeX = new Scanner(System.in);
		int treeXx = treeX.nextInt();
		
		for (int treeT = 1; treeT < treeXx; treeT++) {
			for(int treeT1 = treeXx ; treeT1 > treeT ; treeT1--) {
				System.out.print("-");
			}
			for(int treeT2 = 1; treeT2 < treeT ; treeT2++) {
				System.out.print("+");
			}
			for (int treeT3 = 0; treeT3 < treeT ; treeT3++) {
				System.out.print("+");
			}
			for (int treeT4 = treeXx; treeT4 > treeT; treeT4--) {
				System.out.print("-");
			}System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
