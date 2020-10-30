package chap14.api;

import java.util.function.Predicate;

public class PredicateEx1 {// boolean 리턴
	public static void main(String[] args) {
		Predicate<Integer> isEven = x -> x % 2 == 0;
		Predicate<Integer> isOdd = x -> x % 2 == 1;
		
		boolean b = isEven.test(55);
		System.out.println(b);
		
		System.out.println(isOdd.test(33));
	}
}
