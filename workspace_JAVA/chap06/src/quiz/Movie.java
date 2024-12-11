package quiz;

public class Movie {
	

	String MovieName;
	int MovieYear;
	
	Movie(){
		
	}
	
	Movie (String title, int year){
		this.MovieName = title;
		this.MovieYear = year;
	}
	
	void setTitle(String title) {
		if(title != null) {
			this.MovieName = title;
		}
		else {
			System.out.println("제목을 입력해주세요");
		}
	}
	
	void list(){
		System.out.println(this.MovieName);
		System.out.println(this.MovieYear);
	}
	

	
}
