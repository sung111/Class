package sec01.exam01;

public class HumanException extends Exception{


	HumanException(){
		System.out.println("HumanException 持失");
	}
	
	HumanException(String msg){
		super(msg);
		System.out.println("HumanException String 持失");
	}
	
	
	
	
}
