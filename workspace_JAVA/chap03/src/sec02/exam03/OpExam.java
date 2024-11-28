package sec02.exam03;

public class OpExam {

	public static void main(String[] args) {

		boolean a = false;
		System.out.println(a);
		
		a = !a;
		System.out.println(a);
		
		double b = 7.0;
		System.out.println(b/3);
//		System.out.println(b/0); double 을 0으로 나누면 Infinity 에러 출력
//		System.out.println(3/0); int를 0으로 나누면 "/by zero" 에러 출력 
		
		int c = 123123123;
		int d = 5;
		System.out.println("몫 :" + (c/d) );
		System.out.println("나머지 :" + (c%d) );
		
//		만원이있고 4500짜리 커피를 몇잔마실수있나?
		int money = 10000;
		int coffee = 4500;
		int count = money / coffee;
		System.out.println(count + "잔");
		int change = money % coffee;
		System.out.println(change + "원");
		
//		올리브영에서 15%세일
//		1. 꿀항차 5000 원을 샀을때 얼마를내야하나?
		int AA = 5000;
		int BB = 30000;
		double CC = 0.15;
		System.out.println("\n" + (AA - (int)(AA * CC)) + "원");
		
//		2. 꿀홍차 5000 과 립스팀 30000을 사면 얼마를내야하나?
		int DD = AA+BB;
		System.out.println(DD - (int)(DD * CC)+"원");
		
//		3. 7234원 에서 5000, 1000, 500, 50, 10, 1원 각각 최대 몇개까지로 값을 지불할수있는가?
		int AAA,BBB,CCC,DDD,EEE,FFF,GGG,HHH,AAAmod,BBBmod,CCCmod,DDDmod,EEEmod,FFFmod;
		AAA = 5000;
		BBB = 1000;
		CCC = 500;
		DDD = 100;
		EEE = 50;
		FFF = 10;
		GGG = 1;
		HHH = 7234;
		AAAmod = HHH%AAA;
		BBBmod = AAAmod%BBB;
		CCCmod = BBBmod%CCC;
		DDDmod = CCCmod%DDD;
		EEEmod = DDDmod%EEE;
		FFFmod = EEEmod%FFF;
		
		System.out.println("\n"+
				AAA + "원" + (HHH / AAA) + "개\n" +
				BBB + "원" + (AAAmod / BBB) + "개\n" +
				CCC + "원" + (BBBmod / CCC) + "개\n" +
				DDD + "원" + (CCCmod / DDD) + "개\n" +
				EEE + "원" + (DDDmod / EEE) + "개\n" +
				FFF + "원" + (EEEmod / FFF) + "개\n" + 
				GGG + "원" + (FFFmod / GGG) + "개\n" 
				);
		
//		System.out.println(
//				AAA + "원" + (GGG / AAA) + "개\n" +
//				BBB + "원" + (GGG / BBB) + "개\n" +
//				CCC + "원" + (GGG / CCC) + "개\n" +
//				DDD + "원" + (GGG / DDD) + "개\n" +
//				EEE + "원" + (GGG / EEE) + "개\n" +
//				FFF + "원" + (GGG / FFF) + "개\n"
//				);
		
		System.out.println(""+3+3.0+333);
		String c2 = "100";
		int c3 = Integer.parseInt(c2);
		System.out.println(c3 + 3);
		
		boolean bool = 3 > 5;
		System.out.println(bool);
		
		System.out.println( 1 == 1);
		System.out.println( 1 == 1.0);
		System.out.println( 1.0f == 1.0);
		
		System.out.println('a'>'c');
		System.out.println("3 != 3 : " + (3 != 3));
		
		String s1 = "박혜성";
		String s2 = "박혜성";
		System.out.println(s1.equals(s2));
//		String변수 또는 "글씨".equals(비교값)
		
		int i1 = 87;
		System.out.println(i1 +"은 B학점인가?");
		System.out.println(
				(i1 >= 80) && (i1 < 90)
				);
		System.out.println(
				(i1 >= 80) || (i1 < 90)
				);
		
		int k1 = 7;
		int k2 = 15;
		int k3 = 17;
//		k3이 가장큰 값인가?
		System.out.println(k3 > k2 && k3 > k1);
		
		int m1 = 5;
		m1 += 2;

		int n1 = 1;
		n1++;
		n1--;
		System.out.println(n1);
		
		int n2 = 10;
		System.out.println(n2++ + 10 +1);

		int z = 1;
		System.out.println( z++ + ++z );
		System.out.println( z+ "\n\n\n" );
		
		int score = 95;
		char grad = (score > 90) ? 'A' : 'B'; // A 출력
		System.out.println("\t" + grad);
		
			
		int value = 365;
		System.out.println( value / 100 * 100);
		
		int var1 = 5;
		int var2 = 2;
		double var3 = ((double)var1/(double)var2);
		int var4 = (int)(var3 * var2);
		System.out.println(var4);
		
		double v1 = 1000;
		double v2 = 457;
		double v3 = (v1 / v2) * 1000;
		double v4 = (int)v3;
		double v5 = v4 / 1000;
		System.out.println( v5 );
		double y1 = 1000;
		double y2 = 457;
		double y3 = (y1 / y2) * 1000;
		double y4 = (int)((y1 /y2) * 1000);
		double y5 = ((double)(int)((y1 / y2) * 1000)) / 1000;
		System.out.println( y5 );
	}
}






