package chap14.lambda;

import chap14.lambda.NestedEx1.MyInterface;

public class NestedEx2 {
	private int outterField;
	
	public void method() {
		MyInterface i1 = () -> {// Myinterface의 method()를 재정의한 것!
			int outterField = 3;
			System.out.println("익명 클래스의 객체 (local class) ");
			System.out.println(this);// 쓸 수 있다, 클래스 정의니까
			System.out.println(outterField);// 같은 이름의 변수 정의해서 사용
			System.out.println(NestedEx2.this.outterField);// 바깥 클래스의 필드
		};
		// 호출은 이렇게
		i1.method();
	}
	
	public static void main(String[] args) {
		NestedEx2 n1 = new NestedEx2();
		n1.method();
	}
}
