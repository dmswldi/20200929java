package chap08;

public class DefaultMethodEx {
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2(); // 기존 구현 클래스로 추가된 디폴트 메소드 실행 가능
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2(); // 재정의 메소드 실행
	}
}


interface MyInterface {
	public void method1();
	// 수정, 추가
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}

class MyClassA implements MyInterface { // 기존 구현 클래스
	@Override
	public void method1() {
		System.out.println("MyClassA-method1() 실행");
	}
}

class MyClassB implements MyInterface {
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}
	@Override
	public void method2() {
		// MyInterface.super.method2(); // interface의 method2(): 결과 MyInterface-method2 실행
		System.out.println("MyClassB-method2() 실행");
	}
}


