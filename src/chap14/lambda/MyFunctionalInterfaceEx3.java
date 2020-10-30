package chap14.lambda;

public class MyFunctionalInterfaceEx3 {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;// 리턴값
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);// 리턴값
		System.out.println(fi.method(2, 5));
		
	}
	
	private interface MyFunctionalInterface {
		public int method(int x, int y);
	}
	
	public static int sum(int x, int y) { return x + y; }
}