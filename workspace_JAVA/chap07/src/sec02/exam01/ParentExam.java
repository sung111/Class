package sec02.exam01;

public class ParentExam {

	public static void main(String[] args) {
		
		Parent3_1 p3_1 = new Parent3_1();
		
		
//		Parent2_1 p2_1 = (Parent2_1)p3_1;	//생략 ver
		Parent2_1 p2_1 = p3_1;
		
		Parent1 p1 = p2_1;
		
		p1 = p3_1;
		
		Parent1 p1_1 = new Parent3_1();
		
		///////////////////////////////////
		Parent1 p1_2 = new Parent2_2();
		
//		p1_1 = p1_2;
		
		Parent2_1 p2 = (Parent2_1)p1_1; 
		Parent2_1 p22 = (Parent2_1)p1_2;		//오류임ㅋ 
		
		
		
	}

}
