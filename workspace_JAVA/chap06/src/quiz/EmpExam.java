package quiz;

public class EmpExam {

	public static void main(String[] args) {

		Emp emp = new Emp();
		emp.empno = 7369;
		emp.ename = "SMITH";
		emp.mgr = 7902;
		emp.sal = 800;
		Emp emp2 = new Emp();
		emp2.empno = 7499;
		emp2.ename = "ALLEN";
		emp2.mgr = 7698;
		emp2.sal = 1600;
		Emp emp3 = new Emp();
		emp3.empno = 7521;
		emp3.ename = "WARD";
		emp3.mgr = 7698;
		emp3.sal = 1250;
		Emp emp4 = new Emp();
		emp4.empno = 7566;
		emp4.ename = "JONES";
		emp4.mgr = 7839;
		emp4.sal = 2975;
		Emp emp5 = new Emp();
		emp5.empno = 7654;
		emp5.ename = "MARTIN";
		emp5.mgr = 7698;
		emp5.sal = 1250;
		Emp emp6 = new Emp();
		emp6.empno = 7698;
		emp6.ename = "BLAKE";
		emp6.mgr = 7839;
		emp6.sal = 2850;
		
		EmpTable et = new EmpTable();
		et.add(emp);
		et.add(emp2);
		et.add(emp3);
		et.add(emp4);
		et.print();
//		et.rmq(1000);
		et.rmq1(2000);
		et.sangsa("WARD");
	}

}
