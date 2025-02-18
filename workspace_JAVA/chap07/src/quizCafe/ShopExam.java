package quizCafe;

public class ShopExam {

	public static void main(String[] args) {
		
		Welfare w = new Welfare();
		Baristar b = new Baristar();
		Bread b2 = new Bread();
		HallStaff h = new HallStaff();
		
		
		
//		월급 줘버리기
		System.out.println("-------------------");
		w.pay(b);
		w.pay(b2);
		w.pay(h);
		
//		공부해보리기
		System.out.println("-------------------");
		w.study(b);
		w.study(b2);
		w.study(h);
		
//		손놈 받아보리기
		System.out.println("-------------------");
		b.gust();
		b2.gust();
		h.gust();
		
		
		
		
		
	}

}
