package chap09;

public class OutterClass { // 얘는 static일 수 없다! -> why?
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(OutterClass.this.field);
			// System.out.println(OutterClass.field); // 이렇게는 X, 되려면 필드가 static
			OutterClass.this.method();
		}
	}
}
