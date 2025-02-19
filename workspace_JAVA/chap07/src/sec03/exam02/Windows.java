package sec03.exam02;

public abstract class Windows {
	
	abstract void start();
	
	void boot() {
		System.out.println("cmos 시랭");
		System.out.println("Window 시랭");
		start();
		System.out.println("Window 실행 성공! 커서는 로딩ing....");
	}
	
	
	
}
