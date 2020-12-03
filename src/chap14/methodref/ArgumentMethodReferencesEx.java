package chap14.methodref;

import java.util.function.BiFunction;
import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesEx {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		
		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase;//
		print(function.applyAsInt("Java8", "JAVA8"));
		
		
		// test
		BiFunction<String, String, String> function2;// String, String을 받아 String 리턴
		
		function2 = (a, b) -> a.concat(b);
		System.out.println(function2.apply("abcde", "fgh"));
		
		function2 = String :: concat;
		System.out.println(function2.apply("apple", " juice"));
	}
	
	public static void print(int order) {
		if(order < 0) { System.out.println("사전순으로 먼저 옵니다."); }
		else if (order == 0) { System.out.println("동일한 문자열입니다."); }
		else { System.out.println("사전순으로 나중에 옵니다."); }
	}
}
