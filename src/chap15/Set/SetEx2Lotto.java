package chap15.Set;

import java.util.HashSet;
import java.util.Set;

public class SetEx2Lotto {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while (set.size() < 6) { // while문 쓰면 중복된 값 생겨서 7개 프린트 될 수도 있음
			int num = getNumber();
			set.add(num);
			System.out.println(num);
		}
		System.out.println("size: " + set.size());
	}
	
	public static int getNumber() {
		return (int) (Math.random() * 45) +1;
	}
}
