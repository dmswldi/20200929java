package chap14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorEx1 {
	public static void main(String[] args) {
		Random random = new Random();
		
		// 음수, 0 ,양수 리턴
		Comparator<Integer> asc = (x, y) -> x - y;
		Comparator<Integer> dsc = (x, y) -> y - x;
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));// 0~100
		}
		
		list.sort(asc);
		list.forEach(e -> System.out.println(e));
		
		System.out.println("------");
		
		list.sort(dsc);
		list.forEach(e -> System.out.println(e));
	}
}