package chap13;

public class MyClass<T> {
	public void method1() {
		System.out.println("메소드1");
	}
	
	public void method2(T s) { // T, Object: 모든 타입, 캐스팅만 필요성의 차이
		System.out.println(s);
	}
//	public void method2(Object s) { 
//		System.out.println(s);
//	}
}
