package sec05.exam02_static;

public class CalcExam {

	public static void main(String[] args) {

		System.out.println(Calc.pi);
		
		Calc c = new Calc();
		c.color = "°æ¹Î";
		System.out.println(c.pi);
		
		Calc c2 = new Calc();
		c2.color = "°æ¹Î2";
		System.out.println(c2.pi);
		
		Calc.pi = 2;
		System.out.println(c2.pi);
		
		Calc.printPi();
		c.printPi2();
		
		Calc.out.println("±Û¾¾");
		
		CalcExam ce = new CalcExam();
		ce.test();
//		ce.main(new String[] {"abc"});
//		
//		CalcExam.main(new String[] {"abc"});
	}
	
	void test() {
		
	}

}
