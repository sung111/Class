package sec01.exam01;

public class Parent {
	
	Parent(int a){
		System.out.println("parent 생성자 실행");
	}
	
	String name = "Parent 의 name";
	
	String getName() {
		System.out.println("parent의 getName실행");
		return this.name;
	}
	
	
	
	Parent(String name){
		this.name = name;
	}
	
	
}
