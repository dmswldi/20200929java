package chap07;

public class ChildEx1 {
	public static void main(String[] args) {
		Parent parent = new Child();; // 자동 타입 변환(promotion) -> 부모 클래스의 필드, 메소드만 호출 가능
		parent.field1 = "data1";
		parent.method1();
		parent.method2(); // overriding method
		
		// parent.field2 = "data2";
		// parent.method3();
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method2();
		child.method3();
	}
	
}
