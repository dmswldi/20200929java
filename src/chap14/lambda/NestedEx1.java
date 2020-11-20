package chap14.lambda;

public class NestedEx1 {
	public static void main(String[] args) {
		final int i = 0;
		
		MyInterface i1 = () -> System.out.println("실행");
		i1.method();
		
		MyInterface i2 = new MyInterface() {// 메소드 안 로컬 클래스
			public void method() {
				System.out.println("실행2" + i);// 여기서 인스턴스 필드 쓰면 걔는 final
			};
		};
		i2.method();
		
		
	}
	
	// 왜 클래스 안에만 넣어주면 중복 에러 안 나지
	// -> NestedEx1$MyInterface.class이고 클래스 밖에 정의한 건 MyInterface.class
	@FunctionalInterface
	interface MyInterface {
		void method();
	}
}

