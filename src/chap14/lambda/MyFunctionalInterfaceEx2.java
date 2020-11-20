package chap14.lambda;

public class MyFunctionalInterfaceEx2 {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x) -> {
			int result = 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> { System.out.println(x*5); };
		fi.method(2);
		
		fi = x -> System.out.println(x*5);
		fi.method(2);
	}
	
	
	@FunctionalInterface // 추상 메소드가 하나, Object의 static method나 default method는 ㅇㅋ
	interface MyFunctionalInterface {
		public void method(int x);
		default void method2() {}
		static void method3() {}
	}
}

