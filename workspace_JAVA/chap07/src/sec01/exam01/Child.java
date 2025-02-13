package sec01.exam01;

public class Child extends Parent {
	
	// 상속받았을때 기본생성자
	Child(){
//		super(); // 부모의생성자
		super(1);	
		System.out.println("Child 생성자 실행");
	}
	

	
	
	void printName() {
		System.out.println("name :" + name);
		System.out.println("this.name :" + this.name);
		String pName = getName();
		System.out.println("pName : " + pName);
	}
	
	// 전달인자가 필드를 가리는 현상
	// shadow
	void setName (String name) {
		this.name = name;
	}
	
	int age;
	// 부모의 필드를 가리는현상
	// overshadow
	String name = "child의 name";
	
	String parentName() {
		String name = null; 		//지역변수
		String cName = this.name;	//내 필드
		String pName = super.name;	//부모 필드
		
		return super.name;
	}
	
	
	Child(String name){
		super(name);
	}

	
	
}
