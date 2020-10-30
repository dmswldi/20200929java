package chap14.lambda;

public class ReturnEx1 {
	public static void main(String[] args) {
		MyInterface o1 = (x) -> {
			int y = x * 2;
			return y;
		};
		System.out.println(o1.method(3));
		
		MyInterface o2 = x -> { return x*2; }; // return은 중괄호 필요
		System.out.println(o2.method(10));
		
		MyInterface o3 = a -> a*2;// 1 statement: 값만 작성해도 리턴값인 거 컴파일러가 알아서 잘 해줌
		o3.method(20);
	}
}

@FunctionalInterface
interface MyInterface {
	int method(int a);
}
