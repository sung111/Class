package sec02.exam01;

public class Cat extends Animal{
	
	int age;
	
	@Override
	void sound() {
		System.out.println("³­ Å©¿ÕÀÌ´Ù¿Ë");
	}
	
	@Override
	void eat() {
		System.out.println("Ãò¸¨Ãò¸¨");
	}
	
	void push() {
		System.out.println("ÄîÄî¾² - ´©¸¥´Ù");
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void getAge() {
		int a = this.age;
		System.out.println(" Å©¿ÕÀÌÀÇ ³ªÀÌ´Â "+ a + "ÀÔ´Ï´Ù.");
	}
	
	
	

}
