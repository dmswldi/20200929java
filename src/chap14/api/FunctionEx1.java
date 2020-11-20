package chap14.api;

import java.util.function.Function;

public class FunctionEx1 {
	public static void main(String[] args) {
		Function<String, Integer> strToint = s -> Integer.valueOf(s) * 2;// (T)ype, (R)eturn
		int i = strToint.apply("30");
		System.out.println(i);
		
		Function<Integer, String> intTostr = x -> "값" + x;// Integer Type 받아서 String return
		String str = intTostr.apply(300);
		System.out.println(str);
	}
}
