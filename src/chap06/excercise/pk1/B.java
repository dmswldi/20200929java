package chap06.excercise.pk1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		// a.field3 = 1;
		
		a.method1();
		a.method2();
		// a.method3();
		
		// 같은 패키지 내 private 접근 불가
	}
}
