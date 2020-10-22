package chap09;

public class A1 {
	int field1;
	void method1() { }
	
	static int field2;
	static void method2() { }
	
	// 인스턴스 멤버 클래스 -> 바깥 클래스의 모든 필드, 메소드 접근 가능
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	// 정적 멤버 클래스 -> 바깥 클래스의 static만 접근 가능
	static class C {
		void method() {
			// field1 = 10;
			// method1();
			
			field2 = 10;
			method2();
		}
	}
}
