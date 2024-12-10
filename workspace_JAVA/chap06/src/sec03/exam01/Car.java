package sec03.exam01;

public class Car {
	
	String brand = "아반떼";
	String color = null;
	int cc = 10;
	
//	public Car() {}
	
	public Car(int c) {
		cc = c;
		color = "흰색";
		System.out.println("Car() 생성");
		test();
	}
	
	void test() {
		System.out.println("test() 실행");
	}
	
	Car(String b){
		brand = b;
		System.out.println("Car(String) 생성"+ brand);
	}
	
	//이 생성자에 이름을바꾸면 어떻게호출함?
	Car(){
		this("아반떼", "흰색", 1300);
		System.out.println("아무것도없음 + Car()생성자 실행");
	}
	
	
	Car(String b, String c, int cc2){
//		this();
		brand = b;
		color = c;
		cc = cc2;
		System.out.println("String b, String C, int cc2 생성자 실행");
	}
	
	Car(String brand, int cc){
		this.brand = brand;
		this.cc = cc;
		String color = "파랑";
		System.out.println(color);
		System.out.println(this.color);
				
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	
	
}
