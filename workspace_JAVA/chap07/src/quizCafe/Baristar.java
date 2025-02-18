package quizCafe;

public class Baristar extends Staff{
	
	void make() {
		System.out.println("커 만듬");
	}
	
	void wd() {
		System.out.println("접 딲");
	}
	
	void wkd() {
		System.out.println("장부 작성");
	}
	@Override
	void gust() {
		System.out.println("카페 손님 접대쓰");
	}
	
	@Override
	void study() {
		System.out.println("커피 공부 해버리기");
	}
	
	@Override
	void pay() {
		System.out.println("바리스타 월급 받아보리기");
	}
	
	
	
}
