package sec01.exam02;

public class TypeCastingExam {

	public static void main(String[] args) {

		int a = 2 + (3 * 4); // 우선순위
		long b = (long) a;   // 형변환연산자
		long c = a;
		
		long d = 3000000000L;
		int e = (int)d;
		System.out.println("e : " + e);
//		long 을 int로 변환시
//		8byte중에서 상위 4byte만 남겨서
//		예측하지못한값이 나올수있어서
//		[생력불가능]
		
//		long f = 10;
//		int ii = 10;
//		long f = (long)ii;
//		long f = ii;
		
		int g = 3;
		long h = 4L;
		long i = (long)g + h;
		
		long i2 = g + h;
		
		double j = 3.3;
		double k = (double) g + j;
		double k2 = g + j;
		System.out.println("(double)g :" + (double)g);

		int g2 = (int)j;
		System.out.println("(int)j : " + (int)j);
		
		double total = 8.3;
		int xx = (int)total;
		int count = 4;
		System.out.println((int)total/count);
		
		double totl = 4.3;
		double cot = 4;
		double d_result = totl / cot;
		int i_result = (int)d_result;
		System.out.println("소숫자리없이 명당내야할 값 :" + (int)i_result);
//		double -> int 로 변환시 소숫자리 나라감 
		
//		깜퀴
//		그렇다면 주최자는 얼마를 내야하는가?
		System.out.println("\n얼마내야됨?" +(d_result - ) +"\n");
		
//		문제1
		int o = 30;
		int p = 407;
		int temp = o;
			o = p;
			p = temp;
		System.out.println(o); //407
		System.out.println(p); //30
		
		
	}
}
