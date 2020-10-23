package chap15.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30)); // 1개만 저장됨
		
		System.out.println("총 객체수: " + set.size());
	}
}
