package sec01.exam01;

public class StudentExam {

	public static void main(String[] args) {

		
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조함.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또다른 Student 객체를 참조함.");
		
		System.out.println(s1 == s2);  //false
		
		Student s3 = null;
		s3 = s1;
		
		System.out.println(s1 == s3);  //true
		
		s2 = null;
		
		
		
		
	}

}
