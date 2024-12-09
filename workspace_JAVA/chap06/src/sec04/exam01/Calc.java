package sec04.exam01;

public class Calc {
//	Calc 클래스에서 메소드밖에서 선언한것이 필드인가? ㅇㅇ
//	그리고 책에서는 그 필드에서 고유데이터,부품 객체, 상태정보를저장하는데
//	선언형태가 변수와비슷한데 변수는 메소드에서 사용되고 소멸된다.
//	그렇다면 필드는 전역변수라 봐도 되는가?  ㅇㅇ
	
//	전원, 초기값 false :꺼짐 , true : 켜짐
	boolean isOn = false;
	
//	전원을 켜는
//	isOn = true 로 바꿔주는 메소드 선언
	void powerOn(){
		isOn = true;
		System.out.println("전원을 켭니다.");
	} 
	void powerOff() {
		isOn = false;
		System.out.println("전원을 끕니다.");
	}
	/**
	더하기기능
	두수를 입력받아서 더하기 결과를 돌려줌
	
	메소드명 : plus
	전달인자 : int, int
	리턴타입 : int(두수의합)
	
	Javadoc 주석
	@param : int x, int y
	@return : int
	@author : todair@naver.com
	*/
	
	int plus(int x, int y) {
		System.out.println("x :" + x);
		System.out.println("y :" + y);
		
		int result = x + y;
		
		return result;
	}
	
	/**
	 * 나누기
	 * 두정수를 받아서 
	 * 나누기한 결과를 리턴함
	 *  
	 *  //10 , 4 전달시 2.5돌려받음
	 *  
	 *  */
	
	double divide(double x, double y) {
		
		double result = 0;
		if(y==0) {
			System.out.println("0으로못나눔");
		}else {
			result = (double) x/y;
		}
		
		
		return result;
	}
	// ... 가변인자
	//다른데서 호추할때 : sum(1,2,3,4)
	//내부에서 사용할때 values 는 배열취급
	int sum1(int[] values) {
		int sum1 = 0;
		for (int i = 0 ; i < values.length ; i++) {
			sum1 += values[i];
		}
		return sum1;
	}
	int sum2(int ... values) {
		int sum2 = 0;
		for (int i = 0 ; i < values.length ; i++) {
			sum2 += values[i];
		}
		return sum2;
	}
	
	
	
	
	
	
}
