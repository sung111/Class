package quizCafe;

public class Bread extends Staff{
	
	void make() {
		System.out.println("»§ ¸¸µë");
	}
	
	@Override
	void gust() {
		System.out.println("»§¸Ô´Â ¼Õ´Ô Á¢´ë¾²");
	}
	
	@Override
	void study() {
		System.out.println("»§ °øºÎ ÇØ¹ö¸®±â");
	}
	
	@Override
	void pay() {
		System.out.println("Á¦»§»ç ¿ù±Þ ¹Þ¾Æº¸¸®±â");
	}
	
	
	
}
