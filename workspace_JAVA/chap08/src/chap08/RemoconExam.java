package chap08;

public class RemoconExam {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		powerOn(tv);
		
		
	}
	
	
	
	static void powerOn(RemoteControl rc) {
		rc.turnOn();
	}
	
	

}
