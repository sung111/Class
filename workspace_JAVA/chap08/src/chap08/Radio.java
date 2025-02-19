package chap08;

public class Radio implements RemoteControl {

	int vol;

	@Override
	public void turnOn() {
		System.out.println("Radio Àü¿øÅ´");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio Àü¿ø²û");
	}

	@Override
	public void setVolume(int vol) {
		int max = RemoteControl.MAX_VOLUME;
		int min = RemoteControl.MIN_VOLUME;
		if (vol > max || vol < min) {
			System.out.println("0~10±îÁö ÀÔ·ÂÇÏ½Ç¼öÀÖ¾¸´Ù");
			if (vol < min) {
				this.vol = min;
				System.out.println(this.vol + "·Î º¼·ýÀ» ¹Ù²ãµå·È½À´Ï´Ù.");
			} else {
				this.vol = max;
				System.out.println(this.vol + "·Î º¼·ýÀ» ¹Ù²ãµå·È½À´Ï´Ù.");
			}
		} else {
			this.vol = vol;
			System.out.println(this.vol + "·Î º¼·ý ¹Ù²ã º¸¸®±â!!!!!!!!!");
		}
	}
	
	@Override
	public void mic(String text) {
		
	}
	

}
