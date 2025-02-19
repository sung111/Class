package chap08;

public class Tv implements RemoteControl, Searchable {

	int vol;
	
	@Override
	public void turnOn() {
		System.out.println("tv on!!!!!!!!!");
	}

	@Override
	public void turnOff() {
		System.out.println("tv offffff!!!!!!!!!");
	}

	@Override
	public void setVolume(int vol) {
		int max = RemoteControl.MAX_VOLUME;
		int min = RemoteControl.MIN_VOLUME;
		if( vol > max || vol < min) {
			System.out.println("0~10까지 입력하실수있씀다");
			if(vol < min) {
				this.vol = min;
				System.out.println(this.vol + "로 볼륨을 바꿔드렸습니다.");
			} else {
				this.vol = max;
				System.out.println(this.vol + "로 볼륨을 바꿔드렸습니다.");
			}
		} else {
			this.vol = vol;
			System.out.println(this.vol + "로 볼륨 바꿔 보리기!!!!!!!!!");
		}
	}

	@Override
	public void search(String text) {
		System.out.println("Tv 로" + text + "검색을 하는중 데스요");
	}
	
	
	
	
	

}
