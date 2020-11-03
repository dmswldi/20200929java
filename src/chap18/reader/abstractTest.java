package chap18.reader;

public class abstractTest {
	public static void main(String[] args) {
		a a1 = new b();// 자동 타입 변환, 부모 메소드만 사용 가능
		a1.method();
		a1.method3();
		
		System.out.println("-----");
		b a2 = new b();// 자식, 부모 메소드 모두 ok
		a2.method();
		a2.method2();
		a2.method3();
	}
}

abstract class a {
	abstract void method();
	void method3() {  System.out.println("부모 메소드"); }
}

class b extends a {
	@Override
	void method() {
		System.out.println("오버라이딩 메소드");
	}
	
	void method2() {
		System.out.println("자식 메소드");
	}
	
}