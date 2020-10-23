package chap13;

public class GenericEx2 {
	public static void main(String[] args) {
		MyClass2<Number> o1 = new MyClass2<>();
		MyClass2<Integer> o2 = new MyClass2<>();
		
		
		GenericEx2.<String> method("java");
		// <String>method("java"); 왜 이건 안 될까? 생성자 아닌데...
		method("hello"); // 유추할 수 있으면 생략 가능
		method(3);
		
		String s = method2(); // 컴파일러가 타입을 String으로 유추.
		Integer i = method2();
	}
	 
	public static <T> T method2() { // 객체 안 만들고 사용하려면 static method여야 함
		return null;
	}
	public static <T> void method(T t) {
		System.out.println(t);
	}
	
}
