package chap14.lambda;

public class ParameterEx2 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int a, int b) -> System.out.println(a+b);
		o1.method(3, 10);
		
		MyInterface2 o2 = (x, y) -> System.out.println(x+y);
		o2.method(15, 5);
		
		
//		MyInterface o3 = a, b -> System.out.println(a+b); // 이건 안 됨
	}
}

@FunctionalInterface
interface MyInterface2 {
	void method(int x, int y);
}
