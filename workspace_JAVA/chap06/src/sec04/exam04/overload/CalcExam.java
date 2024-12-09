package sec04.exam04.overload;

public class CalcExam {

	public static void main(String[] args) {

		Calc kk = new Calc();
		
		kk.execute();
		
		kk.plus(1,2);
		System.out.println(kk.plus(8, 5));
		
//		kk.plus(1.1, 1.1);
		kk.plus(1.1, 5);
		
		
		int a= 10;
		double b = 20.3;
		kk.plus(a,b);
		System.out.println(1);
		System.out.println(1.5);
		System.out.println(214748364821112233L);
		

	}

}
