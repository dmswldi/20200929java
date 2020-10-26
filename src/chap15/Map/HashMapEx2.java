package chap15.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		map.put(s1, 95);
		map.put(s2, 95); 
		
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println(s1.hashCode()); // 재정의된 해시코드
		System.out.println(s2.hashCode());
		
		System.out.println(System.identityHashCode(s1)); // 원래 해시코드
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s1); // '@' + Integer.toHexString(hashCode())
		// -> 객체 자체를 프린트하면  toString() 메소드를 호출 = 해시코드를 16진수로 바꾼 것
		System.out.println(s2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
