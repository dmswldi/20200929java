package chap06;

public class Calculator {
	static double pi = 3.14159; // Math.PI;
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	static int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	static int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	
	// 추가
	double avg(int x, int y) {
		double sum = plus(x, y); // int -> double 자동 형변환
		double result  = sum/2;
		return result;
	}
	
	void execute() {  // 클래스 내부에서 메소드 호출
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	
	// 추추가 : 메소드 오버로딩
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}

	
}
