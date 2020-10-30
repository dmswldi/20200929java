package chap14.lambda;

public class LambdaEx2 {
	public static void main(String[] args) {
		MyInterface o1 = () -> {
			System.out.println("hello");
			System.out.println("world");
		};
		
		MyInterface o2 = () -> { System.out.println("java"); };
		MyInterface o3 = () -> System.out.println("java");// 중괄호 없는 게 낫다
		
		o1.method();// 메소드 호출
		o2.method();
		o3.method();
	}
	
	private interface MyInterface {
		void method();
	}
}
