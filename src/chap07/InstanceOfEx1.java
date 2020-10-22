package chap07;

public class InstanceOfEx1 {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent; // 강제 타입 변환 (casting)
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	// ClassCastException 발생 가능
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		try {
			Parent parentB = new Parent();
			method1(parentB); // 변환 x
			method2(parentB); // ClassCastException->return;(프로그램 종)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
