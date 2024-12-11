package quiz;

public class TvControl {
	
	
	boolean onOff = false;
	int volume = 5;
	int channel = 1;
	//정보
	
//	--------파워---------
	//0끔 1켬
	void power(int x) {
		if(x==1) {
			System.out.println("전원을 켭니다.");
			this.onOff = true;
		}
		else if(x==0){
			System.out.println("전원을 끕니다.");
			this.onOff = false;
		} else {
			System.out.println("선택범위를 확인하세요.");
		}
	}
	
	
//	-----volume-------
	int volUp(int x) {
		if(this.onOff == true && volume+x > 100) {
			System.out.println("최대치는 100 volume 입니다.");
		}else if(this.onOff == true) {
			volume += x;
			System.out.println("볼륨을 " + x + "올립니다.");
			System.out.println("현재볼륨은 " + volume + " 입니다.");
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
		return 0;
	}
	
	int volDown(int x) {
		if(this.onOff == true && volume-x < 0) {
			System.out.println("최대치는 100 volume 입니다.");
		}else if(this.onOff == true) {
			volume += x;
			System.out.println("볼륨을 " + x + "내립니다.");
			System.out.println("현재볼륨은 " + volume + " 입니다.");
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
		return 0;
	}
	
//	-------채널-------
	int chanUp(int x) {
		if(this.onOff == true) {
			channel += x;
			System.out.println("채널을 " + x + "내립니다.");
			System.out.println("현재 채널은 " + channel + " 올립니다.");
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
		return 0;
	}
	
	int chanDown(int x) {
		if(this.onOff == true) {
			channel += x;
			System.out.println("채널을 " + x + "내립니다.");
			System.out.println("현재 채널은 " + channel + " 내립니다.");
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
		return 0;
	}
	
	
	
	
	
	
}
