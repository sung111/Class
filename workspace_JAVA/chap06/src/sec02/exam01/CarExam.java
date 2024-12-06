package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {
		
//		Car타입 [변수명] new=새로운 Car클래스참조
		Car mycar = new Car();  
		
//		myecar.model = 변수mycar 에서 model호출
//		그 모델을 String 타입 m으로 지정
		String m = mycar.model;
		System.out.println(m);

		
		Car mycar2 = new Car();
		mycar2.model = "N반떼";
		
		System.out.println("mycar.model :" + mycar.model);
		System.out.println("mycar2.model :" + mycar2.model);
		
		System.out.println("mycar.speed :" + mycar.speed);
		
		System.out.println(mycar);
		
	}

}
