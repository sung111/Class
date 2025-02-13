package sec01.exam01;

public class ExtentdsExam {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.printName();
		String cName = c.getName();
		System.out.println("cName :" + cName);
		System.out.println("c.name :" + c.name);
		
		System.out.println(c.parentName());
		
		Child c2 = new Child("ªı¿Ã∏ß");
		String pName2 = c2.parentName();
		System.out.println(pName2);
		
		
		

	}

}
