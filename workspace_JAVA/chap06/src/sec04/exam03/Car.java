package sec04.exam03;

public class Car {
	
	int gas = 5;
	int speed;
	
	void setSpeed(int s) {
		speed = s;
	}
	
	void setGas(int g) {
		gas = g;
		return;
	}
	
	boolean isLeftGas() {
		boolean result = false;
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			result = false;
		}else {
			System.out.println("gas가 있습니다.");
			result = false;
		}
		
		return result;
		
	}
	
	
}
