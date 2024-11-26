package sec01.exam02;

public class VariableUseExam {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 15;
		System.out.println(hour + "시간 " + minute + "분");

		int totalMinute = (hour * 60) + minute;
		System.out.println("총" + totalMinute + "분");
		
		int totalSec = totalMinute * 60;
		System.out.println("총" + totalSec + "분");
		
		int x = 10;
		int y = 20;
		System.out.println(" x 의 값은 ? : " + x );
		System.out.println(" x + y 의 값은 ? : " + (x + y) );
		
		x = y;
		System.out.println(" x 의 값은 ? : " + x );
		
		int z = 3;
		int c = 5;
		System.out.println("z:" + z + ", c:" + c );
		
		int temp = 5;
		z = c;
		c = temp;
		System.out.println("z:" + z + ", c:" + c );
		
		int j = 1;
		System.out.println("j : " + j);
		{
			int i = 0;
			System.out.println("i : " + i);
		}
		
	}

}
