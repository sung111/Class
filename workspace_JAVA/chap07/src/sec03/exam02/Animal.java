package sec03.exam02;

public abstract class Animal {
	
	String kind;
	
	void breathe() {
		System.out.println("쉄숴 숨숴");
	}
	
	//추상메소드
	//abstract 키워드가 붙은 메소드
	// 실행블럭 {} 이 있으면안댐
	// 대신 나를 생속받은 자식이 필수로 구현해야함
	abstract void sound();
	
	
	
	
	
	
}
