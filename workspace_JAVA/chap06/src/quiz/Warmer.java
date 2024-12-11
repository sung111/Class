package quiz;

public class Warmer {
	
	//전원 켜,끄기 기능
	//저온 발열기능(전원이 켜져있을때만)
	//고온 발열기능(전원이 켜져있을때만)
	//전원 온(발열중지)
	//상태 표시 기능 (전원상태와 발열 상태출력)
	
	boolean onOff = false;
	int power;
//	int situation;
//	private int onHigh;
	
	boolean onOff(int x) {
		if(x == 1) {
			this.onStop();
		} else {
			this.stop();
		}
		return false;
		
	}
	
	//0off 1on 2저온 3고온
	int power(int x) {
		if(x==3 && this.onOff == true) {
			this.onHigh();
			power = 3;
			return 3;
		} else if(x==2 && this.onOff == true) {
			this.onLow();
			power = 2;
			return 2;
		} else {
			
		}
		return 0;
	}
	
	int onLow() {
		System.out.println("저온 출력");
		return 2;
	}
	
	int onHigh() {
		System.out.println("고온 출력");
		return 3;
	}
	
	void onStop() {
		this.onOff = true;
		System.out.println("전원이 켜졌습니다.");
		System.out.println("동작하지는 않습니다.");
	}
	void stop() {
		System.out.println("전원이 꺼졌습니다.");
		this.onOff = false;
	}
	
	
	int situation() {
		System.out.println("현재 상태를 나타냅니다.");
		if(this.onOff == true && this.power==3) {
			return this.onHigh();
		}
		else if(this.onOff == true && this.power==2) {
			return this.onLow();
		}
		else if(this.onOff == true) {
			onStop();
		} else if (this.onOff != true) {
			stop();
		}

		return 0;
	}
	
	
	
	
	
	
	
}
