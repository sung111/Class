package sec04.exam02;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeExample {

	public static void main(String[] args) {

//		int keyCode;
//		try {
//			keyCode = System.in.read();
//			System.out.println(keyCode);
//			keyCode = System.in.read();
//			System.out.println(keyCode);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Scanner scan = new Scanner(System.in);
		String inputData = scan.nextLine();
		System.out.println("inputdata : " + inputData);
		int input = scan.nextInt();
		System.out.println("input : " + input);
		
	}

}
