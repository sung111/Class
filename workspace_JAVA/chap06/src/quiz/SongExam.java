package quiz;

public class SongExam {

	public static void main(String[] args) {
		
		//클래스 생성
		Song s = new Song();
		//제목과 가수명을 넣고 출력
		
		s.title = "home sweet home";
		s.singer = "GD";
		
		System.out.println(s.title);
		System.out.println(s.singer);
		System.out.println(s.like);
		
		Song s2 = new Song();
		s2.title = "apt";
		s2.singer = "ROSE";
		System.out.println(s2.title);
		System.out.println(s2.singer);
		
		Song s3 = new Song();
		s3.setTitle("나는 반딧불");
		System.out.println(s3.title);
		
		s2.plus(3.5, 3.5);
		s2.plus(s2.plus(3.5, 3.5), 8);
	}

}
