package sec05.exam01;

public class CarExam {

	public static void main(String[] args) {
		
		Car c = new Car("abentee");
		c.printModel();
		Car c2 = new Car("praid");
		c2.printModel();

		System.out.println("---------------");
		System.out.println(c.model);
	}

}
