package sec04.exam01;

public class CalcExam {

	public static void main(String[] args) {
	
//		() = 전달인자 선언
		Calc calc =new Calc();
		
//		() = 실행
		calc.powerOn();
		System.out.println("calc.isOn :" +calc.isOn);
		calc.powerOff();
		System.out.println("calc.isOn :" +calc.isOn);
		
		int a = calc.plus(7, 10);
		int b = 17;
		int a1 = calc.plus(b, 10);
		
		double result = calc.divide(10, 4);
		System.out.println(result);
		
		Calc[] d = new Calc[10];
		System.out.println(d[0]);
		
		d[0] = new Calc();
		
		Calc[] t ={
					new Calc(),
					new Calc()
					};
		System.out.println(t[0]);
		int[] f = {1,2,3,4,5};
		int f1 = calc.sum1(f);
		System.out.println(f1);
		int f2 = calc.sum2(f);
		int f3 = calc.sum2(1,2,3,4,5);
		System.out.println("f2 : " + f2);
		System.out.println("f3 : " + f3);
		
		
		
		
		
		
		
		
		
	}

}
