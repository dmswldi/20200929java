package chap08;
// 인터페이스 - 구현 클래스 - 메인에서 객체 생성
// 인터페이스 - 메인에서 익명 객체 구현(실체 메소드 선언)
public class DefaultMethodEx2 {
	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {
				System.out.println("ci1-method1()");
			}
			// method2()는 default method
			@Override
			public void method3() {
				System.out.println("ci1-method3()");
			}
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {	System.out.println("ci2-method1()"); }
			// method2()는 재정의된 default method
			@Override
			public void method3() { System.out.println("ci2-method3()"); }
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("ci3-method1()");
			}
			@Override
			public void method2() {
				System.out.println("ci3-method2()");
			}
			@Override
			public void method3() {
				System.out.println("ci3-method3()");
			}
		};
		
		ci3.method1();
		ci3.method2();
		ci3.method3();
		
	}
}

interface ParentInterface {
	public abstract void method1();
	public default void method2() { System.out.println("ParentInterface-method2()"); };
}

interface ChildInterface1 extends ParentInterface { // 인터페이스 상속
	public abstract void method3();
}

interface ChildInterface2 extends ParentInterface {
	public default void method2() { System.out.println("overriding method2()"); } // 재정의된 dafault method 
	public abstract void method3();
}

interface ChildInterface3 extends ParentInterface {
	public abstract void method2(); // dafault 메소드를 추상 메소드로 재선언 
	public abstract void method3();
	
}
