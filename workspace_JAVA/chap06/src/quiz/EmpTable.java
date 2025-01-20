package quiz;

import java.util.ArrayList;

public class EmpTable {

//	관리하는 메소드넣기
//	추가,출력
	
	ArrayList list = new ArrayList();
	private Object contine;;
	
	void add(Emp emp) {
		this.list.add(emp);
	}
	
	void print() {
		for(int i = 0 ; i < list.size() ; i++) {
//			list[0]
			Emp e = (Emp)list.get(i);
			System.out.println("empno :" + e.empno);
			System.out.println("ename :" + e.ename);
			System.out.println("gmr :" + e.mgr);
			System.out.println("sla :" + e.sal);
			System.out.println("==================");
		}
	}
	
//	사원급여가 2000이상인사람출력
//	숫자릅입력받으면 그것보다큰사람 한명만
//	int count=0;
//	void rmq (int rmq) {
//		for(int i = 0 ; i < list.size() ; i++) {
//			Emp e = (Emp)list.get(i);
//			if(e.sal > rmq) {
//				break;
//			}
//			count++;
//		}
////		System.out.println(count);
//		Emp e = (Emp)list.get(count);
//		System.out.println("급여가"+rmq+"이상인 사람");
//		System.out.println(e.empno);
//		System.out.println(e.ename);
//		System.out.println(e.mgr);
//		System.out.println(e.sal);
//	}
	
	
	void rmq1(int rmq1) {
		for(int i = 0 ; i < list.size() ; i++) {
			Emp e = (Emp)list.get(i);
			if(e.sal > rmq1) {
				System.out.println("급여" + rmq1 + "이상");
				System.out.println(e.empno);
				System.out.println(e.ename);
				System.out.println(e.mgr);
				System.out.println(e.sal);
			
			}
		}
	}
	int z;
	void sangsa(String t) {
		for(int i = 0 ; i<list.size() ; i++) {
			Emp e = (Emp)list.get(i);
			if(e.ename == t) {
				z = e.mgr;
			}
			if(e.empno == z) {
				System.out.println(e.ename);
			}
		}
	}
	
}
