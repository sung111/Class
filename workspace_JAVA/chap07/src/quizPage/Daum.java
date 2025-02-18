package quizPage;

public class Daum {
	
	String name;
	String id;
	String pw;
	boolean flag = false;

	boolean join(String name, String id, String pw) {
		this.flag = false;
		if (this.id == null || this.id != name) {
			this.name = name;
			this.id = id;
			this.pw = pw;
			System.out.println("성함 :" + name);
			System.out.println("id :" + id);
			System.out.println("naver 회원가입 완료");
			this.flag = true;
		} else {
			System.out.println("아이디가 이미 존재합니다.");
		}
		return flag;
	}

	String findId(String name) {
		if (this.name.equals(name)) {
			System.out.println(this.id);
		}
			return this.id;
	}
	
	String findPw(String name, String id) {
		if (this.name.equals(name) && this.id.equals(id)) {
			System.out.println(this.pw);
		}
		return this.pw;
	}
	
	boolean leginCheck(String id, String pw) {
		this.flag = false;
		if(this.id.equals(id) && this.pw.equals(pw)) {
			System.out.println("존재합니다.");
			this.flag = true;
		}
		return this.flag;
	}

}
