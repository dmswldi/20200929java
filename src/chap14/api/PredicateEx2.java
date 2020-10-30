package chap14.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PredicateEx2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Supplier<Integer> random = () -> (int) (Math.random() * 200) - 50;// -50 ~ 150
		
		for (int i = 0; i < 30; i++) {
			list.add(random.get());
		}
		
//		list.removeIf(e -> (e < 0 || e > 100)? true : false);// true면 remove
		list.removeIf(e -> e < 0 || e > 100);// true면 remove
		
		// 0 ~ 100 값만 남도록
		System.out.println("---값 확인");
		list.forEach(e -> System.out.println(e));
	}
}
