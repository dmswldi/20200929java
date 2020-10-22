package chap06.excercise.pk2;

import chap06.excercise.pk1.A; // 다른 패키지 클래스 사용 시 import

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		// a.field2 = 1;
		// a.field3 = 1;
		
		a.method1();
		// a.method2();
		// a.method3();
		
		// 다른 패키지 클래스의 default, private 접근 불가
	}
}
