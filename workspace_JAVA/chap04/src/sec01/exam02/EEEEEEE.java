package sec01.exam02;

public class EEEEEEE {

	public static void main(String[] args) {

//		double dice = Math.random();
//
//        double temp1 = dice * 5 ;     // 0 ~ 0.99999999999
//        int temp2 =(int)temp1 +1;        // 0 ~ 6.9999999
//        int dice1 = temp2 ;        // 0 ~ 6
//
//        dice = Math.random();
//        double temp11 = dice * 5 ;     // 0 ~ 0.99999999999
//        int temp12 =(int)temp11;        // 0 ~ 6.9999999
//        int dice2 = temp12 +1;        // 0 ~ 6
//        System.out.println(dice2);    // 1 ~ 6
//        System.out.println(dice1);
		
		
//		주사위두개로 나올수있는 모든조합을출력
		int a=0, b=0;
		for(int dice1 = 1; dice1 <=6 ; dice1++) {
			System.out.println("1번 주사위 :" + dice1);
			a++;
			for(int dice2 = 1 ; dice2 <= 6 ; dice2++) {
				b++;
				System.out.println("2번주사위 :" + dice2);
			}
		}System.out.println("---------경우의수   :   " + (a + b) );
		System.out.println();System.out.println();

		
//		중복을 제거한 경우의수
		for(int dice3 = 1; dice3 <=6 ; dice3++) {
			System.out.println("1번 주사위 :" + dice3);
			for(int dice4 = 1 ; dice4 <= 6 ; dice4++) {
				if(dice3 == dice4) {
					continue;
				}
				System.out.println("2번주사위 :" + dice4);
			}
		}
	
		
		
		
	}

}
