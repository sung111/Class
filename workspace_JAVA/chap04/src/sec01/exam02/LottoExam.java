package sec01.exam02;

public class LottoExam {

	public static void main(String[] args) {

		double rand = Math.random();	// 0 ~ 0.999999
		
		double temp1 = rand * 45;		// 0 ~ 0.999999
		
		int temp2 = (int)temp1;			// 0 ~ 44
		
		int lotto1 = temp2 + 1 ;		// 1 ~ 45
		
		System.out.println(lotto1);
		
		rand = Math.random();
		double temp13 = rand *45;
		int temp16 = (int)temp13;
		int lotto3 = temp16 + 1;
		System.out.println(lotto3);
		
		
		
	}

}
