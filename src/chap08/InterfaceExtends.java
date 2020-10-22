package chap08;

public class InterfaceExtends { // 인터페이스 상속
	public static void main(String[] args) {
		// InterfaceC ic = new Implementation(); 인터페이스 타입 = 구현 객체
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl; // 하위 인터페이스로 타입 변환 > 상하위 인터페이스 선언된 모든 메소드 사용 가능 -> 이해
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
	}
}

interface InterfaceA {
	public void methodA();
}
interface InterfaceB {
	public void methodB();
}
interface InterfaceC extends InterfaceA, InterfaceB { // 하위 인터페이스
	public void methodC(); // 얘가 가진 것만 작성
}

class ImplementationC implements InterfaceC { // 구현 클래스
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}
	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");		
	}
	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");		
	}
}