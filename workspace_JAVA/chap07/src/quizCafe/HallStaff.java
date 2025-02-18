package quizCafe;

public class HallStaff extends Staff{
	
	void calc() {
		System.out.println("정산");
	}
	
	void shopManage() {
		System.out.println("정리");
	}
	
	@Override
	void gust() {
		System.out.println("홀 손님 접대쓰");
	}
	
	@Override
	void study() {
		System.out.println("미래의 대한 공부 해버리기");
	}
	
	@Override
	void pay() {
		System.out.println("점원의 월급 받아보리기");
	}
	
	
	
}
