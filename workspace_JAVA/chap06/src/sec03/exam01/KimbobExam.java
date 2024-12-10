package sec03.exam01;

public class KimbobExam {

	public static void main(String[] args) {

		Kimbob chonan = new Kimbob(1000);
		chonan.order(0);
		System.out.println("d");
		chonan.print(0, 3);
		
		chonan.menuList();
		chonan.menuPlus("µ·±ú¾²", 8500);
		chonan.menuPlus("Á¦À°µì¹ä", 8000);
		chonan.menuPlus("±â¹«Ä¡º¸²û¹ä", 8000);
		chonan.menuList();
		Kimbob terminal = new Kimbob(2000);
		terminal.menuList();
		
	}

}
