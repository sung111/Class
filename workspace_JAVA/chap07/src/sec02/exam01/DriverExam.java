package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {
		
		Coupe c = new Coupe();
		
		Driver d = new Driver();
		d.run(c);
		
		Landrover landrover = new Landrover();
		d.run( landrover );
		
//		HumanCar humanCar = new HumanCar();
//		d.run(humanCar);
		
		
		
		
		
	}

}