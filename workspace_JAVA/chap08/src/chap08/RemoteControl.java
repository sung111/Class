package chap08;

public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	int aEEEEEEEEEEEE = 10;
	
	void turnOn();
	void turnOff();
	void setVolume(int vol);
	
	default void mic(String text) {
		
	}
	
	
	
	
	
	
	
}
