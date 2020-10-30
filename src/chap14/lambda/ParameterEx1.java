package chap14.lambda;

public class ParameterEx1 {
	public static void main(String[] args) {
		MyInterface1 o1 = (int a) -> System.out.println(a);
		o1.method(9);
		
		// 파라미터 int인 것 아니까 생략 가능
		MyInterface1 o2 = (i) -> System.out.println(i);
		o2.method(3);
		
		// 메소드 하나면 두문괄호도 생략 가능
		MyInterface1 o3 = x -> System.out.println(x);
		o3.method(10);
	}
}

@FunctionalInterface
interface MyInterface1 {
	void method(int a);
}
