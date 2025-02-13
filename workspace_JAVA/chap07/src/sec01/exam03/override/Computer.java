package sec01.exam03.override;

public class Computer extends Calc {
	
	@Override // 부모에 해당메소드가 똑같이 있는지 검사해쥼
	int plus(int a , int b) {
		System.out.println("문의하신 정다쁘 와");
		System.out.println(a+b+"이무니다");
		return a+b;
	}
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer의 Circle 실행");
		return Math.PI * r * r;
	}
	
	
	
	
	
	

}
