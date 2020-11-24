package chap06;

import java.util.Comparator;

public class MyAppAPI {
	public static void main(String[] args) {
		String s = new String("java");
		Comparator<String> a = s.CASE_INSENSITIVE_ORDER; // uppercase == lowercase
		// 정렬할 때 공부!!!!!
		System.out.println(a.compare("abcd", "Bc"));
		//Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		
		String t = new String(new char[] {'h', 't', 'm', 'l'});
		System.out.println(t);
		char c = t.charAt(1);
		System.out.println(c);
		
	}
}
