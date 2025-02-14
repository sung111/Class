package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {
		
//		Animal의 eat() 과  sound() 만 알고있음
		Animal a1 = new Animal();
		a1.eat();
		a1.sound();
		
		Cat cat = new Cat();
		cat.sound();
		cat.eat();
		cat.push();
		cat.kk();
		
		Animal a2 = (Animal)cat; // 자식이 부모가될때
		a2.kk();
		a2.eat();			
		Animal a3 = cat; 		//형변환 연산자 생략가능
//		안댐
//		a3.push();
		
//		Dog dog = new Dog();
//		Animal a5 = (Animal)new Dog();
		Animal a4 = (Animal)new Dog();
		a4.eat();
		a4.sound();
		
		catMom(cat);
		Dog dog = new Dog();
//		catMom(dog);
		
		
		Animal a6 = (Animal)cat;
		feed(a6);
		feed(dog);
		
		cat.getAge();
		System.out.println("a6 == cat : " + (a6 == cat));
		
		
	}
	
	static void catMom(Cat cat) {
		System.out.println("--------------");
		System.out.println("catMom 실행");
		cat.eat();
		cat.sound();
	}
	
	static void feed(Animal animal) {
		System.out.println("--------------");
		System.out.println("feed 실행");
		animal.eat();
		animal.sound();
	}
	
	

}
