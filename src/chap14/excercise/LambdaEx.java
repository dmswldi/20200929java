package chap14.excercise;

import java.util.function.IntSupplier;

public class LambdaEx {// 4
	public static int method(int x, int y) {
		/*
		IntSupplier supplier2 = new IntSupplier() {
			@Override
			public int getAsInt() {
				return 0;
			}
		};
		*/
		IntSupplier supplier = () -> {
			// 익명객체 내부에서 사용된 x, y는 final로 선언되어 수정 불가능!!! 
			//x *= 10;
			int result = x * 10 + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(method(3, 5));
	}
}
