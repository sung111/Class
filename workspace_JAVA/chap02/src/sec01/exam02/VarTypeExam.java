package sec01.exam02;

public class VarTypeExam {

	public static void main(String[] args) {

		byte b = 127;
//		b = 128;
		char c1 = 'A';
		System.out.println("c1 :" + c1);
		char c2 = 67;  //'C'
		System.out.println("c2 :" + c2);
		char c3 = 'a'; 
		System.out.println("c3-c1  :" + (c3-c1));
		
		String s1 = "박혜성";
		String s2 = "\"박혜성\"";
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		String s3 = "번호 \t이름";
		System.out.println(s3);
		String s4 = "번호 2\t이름";
		System.out.println(s4);
		
		String s5 = "\n홍 길 동 \n김 자 바";
		System.out.println("s5 :" +s5);
		System.out.println();
		System.out.print("1");
		System.out.print("2");
		System.out.println("3");
		
		double d = 0.123456789123456789;
		System.out.println("d : " + d);
		float f = 0.123456789123456789f;
		System.out.println("f : " + f);
		
		boolean b1 = true;
		boolean b2 = false;
	}

}
