package sec01.exam01;

import java.util.ArrayList;

public class ArrayCopyExam {

	public static void main(String[] args) {

		
		
//		1호점에서 판매하는 메뉴
		String[] menu1 = new String[3];
		menu1[0] = "복숭아";
		menu1[1] = "아이";
		menu1[2] = "스티";
		
//		2호점에서 1호점과같은 메뉴를 판매할거임
//		얕은복사(shallow copy, thin copy, C : call by reference)
//		stack 영역의 값(주소)만 복사함
//		값을 변경할경우 원본이 바뀜.
		
		String[] menu2 = menu1;
//		얕은 복사로 연결되어어있어서
//		즉, 주소값만 공유하는 거라서
//		복사본을 바꿔도 원본이 변경됨
		
		menu2[2] = "바나나라떼";
		System.out.println("menu1[2]" + menu1[2]);
		
//		깊은 복사 (deep copy, deep clone, C : call by value)
//		전혀 다른 heap영역에 똑같은 내용으로 채워놓은것
//		원본과 복사본은 전혀다른 객체임.
		
		String[] menu3 = new String[menu1.length];
		
		for (int i = 0 ; i < menu1.length ; i++) {
			menu3[i] = menu1[i];
		}
		menu3[2] = "연유 라떼";
		
		System.out.println("menu1[2]" + menu1[2]);
		System.out.println("menu3[2]" + menu3[2]);
		
//		3호점에서만 사라다빵을 판매하고싶음
//		menu3보다 크기가 1개많은 새로운 배열을만들고 
//		앞부분은 깊은복사를하고 마지막에 사라다빵을 삽입
		
		menu3 = new String[menu1.length + 1];
		
		for (int i = 0 ; i < menu1.length ; i++) {
			menu3[i] = menu1[i];
		}
		menu3[menu3.length-1] = "사라다빵빵빵";
		for (int i = 0 ; i < menu3.length ; i++) {
			System.out.println(menu3[i]);
		}		
		
		
//		ArryList 사용법
		ArrayList list = new ArrayList();
//		추가방법
		list.add(1);
		list.add("문자");
		list.add(false); //모든타입가능 유동적인 size
//		사용방법
		System.out.println( list.get(0)); //추가한 순서를 보장해줌
		System.out.println( list.get(1)); 
		System.out.println( list.get(2)); 
//		size 확인 방법
		System.out.println(list.size()); //배열의 length 와 같음
//		출력방법
		System.out.println(list); //보기좋게 출력해줌.
		
		
//		for (타입변수 : 배열){ 반복문 }
//		향상된 for문은 반복실행을 하기위해 루프 카운터 변수와 증감식을 사용하지않습니다.
//		배열의 항목개수만큼 반복하고, 자동적으로 for문을 빠져나감
//		반복할때마다 변수에는 배열에서 가져온 항목이 저장됨.
		
//		향상된 for문
		for( String menu : menu3 ) {
			System.out.println("menu :" + menu);
		}
		
		
//		223p 문제 5번
//		합
//		평균 : 합/ 개수
//		최대값
		int[][] array = {
						{95, 86},
						{83, 92, 96},
						{78,83,93,87,88}
						};
		int sum = 0;
		double avg = 0.0;
		double N = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0; j < array[i].length ; j++) {
				sum += array[i][j];
				N += 1;
				if(max < array[i][j]) {
					max = array[i][j];
				}
			}
		}
		avg = sum / N;
		System.out.println("sum :"+ sum);
		System.out.println("avg :"+ avg);
		System.out.println("max :"+ max);
		
		
		
		
		
		
	}

}
