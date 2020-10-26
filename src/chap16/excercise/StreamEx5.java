package chap16.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx5 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
			"This is a java book",
			"Lambda Expressions",
			"Java8 supports lambda expressions"
		);
//		list.stream()
//		
//			.forEach(a -> System.out.println(a));
		
		// 변형
		List<String> javaList = new ArrayList<>();
		for(String java : list) {
			/* if(java.toLowerCase().indexOf("java") != -1) { // .contains("java") vs. .indexOf("java")
				javaList.add(java);
			} */
			if(java.toLowerCase().contains("java")) {
				javaList.add(java);
			}
		}
		
		for (String java : javaList) {
			System.out.println(java);
		}
	}
}
