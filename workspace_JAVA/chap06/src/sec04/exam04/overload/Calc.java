package sec04.exam04.overload;

public class Calc {
	int plus(int x, int y) {
		int result = x+ y;
		System.out.println("int int plus");
		return result;
	}
	
	double plus(double x, double y) {
		double result = x+ y;
		System.out.println("double double plus");
		return result;
	}
	
	double plus(double x, int y) {
		double result = x+ y;
		System.out.println("double int plus");
		return result;
	}
	
	double plus(int x, double y) {
		double result = x+ y;
		System.out.println("int double plus");
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg (7, 10);
		println("실행결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
//	void method1(String classDept, int classNum) {
//		System.out.println(classDept + ","+ classNum);
//	}
//	void method2() {
//		method1("천안",1);
//	}
	void method(String classDept, int classNum) {
		System.out.println(classDept + ","+ classNum);
	}
	void method() {
		method("천안",1);
	}
	
	
	
	
	

}
