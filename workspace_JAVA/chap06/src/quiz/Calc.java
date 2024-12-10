package quiz;

public class Calc {
	
	String str;
//	+ - * / %
//	각각 메소드만들기
//
//	--------plus---------
	/**
	 * plusmultiple
	 * @param int + int
	 * @return int
	 * 
	 **/
	int plus(int a,int b) {
		return a+b;
	}
	/**
	 * plus
	 * @param double + int
	 * @return double
	 * 
	 **/
	double plus(double a,int b) {
		return a+b;
	}
	/**
	 * plus
	 * @param int + double
	 * @return double
	 * 
	 **/
	double plus(int a,double b) {
		return a+b;
	}
	/**
	 * plus
	 * @param double + double
	 * @return double
	 * 
	 **/
	double plus(double a,double b) {
		return a+b;
	}
	
//	--------minus---------
	/**
	 * minus
	 * @param int + int
	 * @return int
	 * 
	 **/
	int minus(int a,int b) {
		return a-b;
	}
	/**
	 * minus
	 * @param double+ int
	 * @return double
	 * 
	 **/
	double minus(double a,int b) {
		return a-b;
	}
	/**
	 * minus
	 * @param int + double
	 * @return double
	 * 
	 **/
	double minus(int a, double b) {
		return a-b;
	}
	/**
	 * minus
	 * @param double + double
	 * @return double
	 * 
	 **/
	double minus(double a,double b) {
		return a-b;
	}
	
	
//	--------multiple---------

	/**
	 * multiple
	 * @param int + int
	 * @return int
	 * 
	 **/
	int multiple(int a, int b) {
		return a*b;
	}
	/**
	 * multiple
	 * @param int + double
	 * @return double
	 * 
	 **/
	double multiple(int a, double b) {
		return a*b;
	}
	/**
	 * multiple
	 * @param double + int 
	 * @return double
	 * 
	 **/
	double multiple(double a, int b) {
		return a*b;
	}
	/**
	 * multiple
	 * @param double + double 
	 * @return double
	 * 
	 **/
	double multiple(double a, double b) {
		return a*b;
	}
	
	
//	--------divide---------

	/**
	 * divide
	 * @param double / double
	 * @return double
	 * 
	 **/
	double divide(double a, double b) {
		return a/b;
	}
	/**
	 * divide
	 * @param int / double
	 * @return double
	 * 
	 **/
	double divide(int a, double b) {
		return a/b;
	}
	/**
	 * divide
	 * @param double / int
	 * @return double
	 * 
	 **/
	double divide(double a, int b) {
		return a/b;
	}
	
//	--------remain---------
	
	/**
	 * remain
	 * @param double % double
	 * @return double
	 * 
	 **/
	double remain(double a, double b) {
		return a % b;
	}
	/**
	 * remain
	 * @param int % double
	 * @return double
	 * 
	 **/
	double remain(int a, double b) {
		return a % b;
	}
	/**
	 * remain
	 * @param double % int
	 * @return double
	 * 
	 **/
	double remain(double a, int b) {
		return a % b;
	}
	/**
	 * remain
	 * @param int % int
	 * @return int
	 * 
	 **/
	int remain(int a, int b) {
		return a % b;
	}
	
//	--------compute---------
	/**
	 * compute
	 * @param double a, String c, double b
	 * @return double
	 * 
	 **/
	double compute(double a, String c, double b) {
		double result = plus(a,b);
		return result;
	}
	/**
	 * compute
	 * @param int a, String c, double b
	 * @return double
	 * 
	 **/
	double compute(int a, String c, double b) {
		double result = plus(a,b);
		return result;
	}
	/**
	 * compute
	 * @param int a, String c, int b
	 * @return double
	 * 
	 **/
	int compute(int a, String c, int b) {
		int result = plus(a,b);
		return result;
	}
	
	
}
