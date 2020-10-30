package chap14.api;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx1 {// 공급 -> 리턴값만 있음
	public static void main(String[] args) {
		Supplier<Double> nextDouble = () -> Math.random();
		DoubleSupplier nextDouble2 = () -> Math.random();
		
		Supplier<Integer> nextLottoBall = () -> (int) (Math.random()*45 +1);
		IntSupplier nextLottoBall2 = () -> (int) (Math.random()*45 +1);
	
		for (int i = 0; i < 6; i++) {
			System.out.println(nextDouble.get());
		}
		System.out.println("=====");
		for (int i = 0; i < 6; i++) {
			System.out.println(nextDouble2.getAsDouble());
		}
		System.out.println("=====");
		for (int i = 0; i < 6; i++) {
			System.out.println(nextLottoBall.get());
		}
		System.out.println("=====");
		for (int i = 0; i < 6; i++) {
			System.out.println(nextLottoBall2.getAsInt());
		}
		
	}
}
