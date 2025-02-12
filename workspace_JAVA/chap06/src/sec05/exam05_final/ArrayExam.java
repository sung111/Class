package sec05.exam05_final;

public class ArrayExam {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		a[0] = 1;
		
		// array
		// 생성하고 나서
		// add() 에 값을 넣으면 자동으로 현재 index에 추가
		// 		단, 크기를 벗어나면 "에러 문구 출력"
		// get()에 index를 넣으면 그 index 의 값을 return 함
		
		Array arr = new Array(5);
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
//		arr.get(4);
//		arr.get(1);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr.get(i));
		}
		
		
	}

}
