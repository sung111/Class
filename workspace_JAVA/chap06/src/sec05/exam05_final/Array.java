package sec05.exam05_final;

public class Array {
	
//	int[] a = new int[3];
//	Array() {
//		System.out.println(a.length);
//		a.length // final 정수 변수
//	}
	
	final int length;
	int[] arr;
	int cursor = 0;
	
	Array(int length){
		this.length = length;
		arr = new int[length];
	}
	
	void add(int x) {
		if(this.length <= cursor) {
			System.out.println("오류문구");
		} else {
			arr[cursor] = x;
			cursor++;
		}
	}
	
	int get(int index) {
		if( this.length <= index) {
			System.out.println("오류 문구");
		} 
		
		return arr[index];
	}
	

}
