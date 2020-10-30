package chap14.lambda;

public class LambdaEx1 {
	public static void main(String[] args) {
		// 추상메소드가 하나인 인터페이스의 객체를 만들 때 주로 사용
		
		MyInterface o1 = new MyInterface() {// 익명 객체: 우항 객체 예상 가능, 하나뿐인 추상메소드명도 알아
			@Override
			public void method() {
				System.out.println("추상메소드 재정의");
			}
		};
		
		
		MyInterface o2 = () -> System.out.println("추상메소드 재정의"); // 인터페이스 이름과 변수, 메소드 내용만 작성
		//() 파라미터 -> 메소드 바디
		
		o1.method();
		o2.method();
	}
	
	private interface MyInterface {
		void method();
	}
}

