package sec03.exam02;

public class AnimalExam {
	
	public static void main(String[] args) {
		
	
//		new Animal();
		Dog dog = new Dog();
		Animal a = dog;
		a.sound();
		
		Dog dog3 = new Dog();
		dog3.name = "강아지 1호";
//		setName(dog3);
		System.out.println(dog3.name);

	}
	
	static void setName(Dog dog) {
		dog.name = "강아지 2호";
	}
	
}
