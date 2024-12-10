package quiz;

public class Song {

	String title;	//제목
	String singer;	//가수명
	int like;		//좋아요 수
	
	
	/**
	 * 제목을전달받아
	 * 필드의 title 변경메소드 생성
	 * setTitle
	 * @param input -> String
	 * @return String
	*/
	String setTitle(String title) {
		this.title = title;
		return title;
	}
	
	Song(){
		System.out.println("Song 생성자 실행");
	}
	
	
	double plus (double a, double b) {
		double result = a+b;
		System.out.println("plus 결과 :" + result);
		return result;
	}
	
	
	
	
}
