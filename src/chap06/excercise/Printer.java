package chap06.excercise;

public class Printer {
	// 16, 17
	// 메소드 오버로딩 : 같은 이름, 다른 파라미터
	static void println(int param) {
		System.out.println(param);
	}
	
	static void println(boolean param) {
		System.out.println(param);
	}
	
	static void println(double param) {
		System.out.println(param);
	}
	
	static void println(String param) {
		System.out.println(param);
	}
	
}
