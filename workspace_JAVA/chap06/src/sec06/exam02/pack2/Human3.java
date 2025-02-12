package sec06.exam02.pack2;

//import sec06.exam02.pack1.Human1;
////import sec06.exam02.pack3.Human1;
//import sec06.exam02.pack1.Human4;

//이거안댐 패키지안에 클래스만가져옴
//import sec06.exam02.*;

//모든클래스 가져옴 //클래스만.
import sec06.exam02.pack1.*;



public class Human3 {
	
	
	
	void test() {
		
		//import 
		// 클래스며어앞에 패키지 정보적기
		sec06.exam02.pack1.Human1 h1 = new sec06.exam02.pack1.Human1();
		
		// import 키워드사용
		Human1 h1_1 = new Human1();

		
		// class public 아님 사용불가
//		Human2 h2 = new Human2();
		// 기본생성자 public이여서 사용가능
		Human4 h4 = new Human4();
		
		
//		System.out.println(h1.a);
		
		
		
		
		
	}
}
