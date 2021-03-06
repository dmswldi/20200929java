package chap14.api;

import java.util.function.IntSupplier;

public class SupplierEx {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {// IntSupplier interface의 getAsInt() 재정의
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수: " + num);
	}
}