package chap06.excercise;

public class MemberService {
	// 15
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) return true;
		return false;
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
