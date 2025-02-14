package sec02.exam01;

public class Driver {
	
	void runCoupe(Car car) {
		System.out.println("Run 박습니다 행님");
		car.drive();
	}
	
	void run(Car car) {
		System.out.println("Run 박습니다 행님");
		car.drive();
		if(car instanceof Landrover) {
			System.out.println("this is Landrover. right?");
			Landrover landrover = (Landrover) car;
			landrover.autoRun();
		}
	}
	
	
	
	
	
	
	
}
