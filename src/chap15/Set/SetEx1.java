package chap15.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// 추가
		set.add("java");
		set.add("html");
		set.add("python");
		set.add("dbms");
		set.add(new String("java")); // 중복, 교체되지 않음, String이 같으면 hashCode 같고(같은 객체로 인식) equals true니까
		
		System.out.println(set.size());
		
		// 삭제
		set.remove("jquery");
		set.remove("html");
		set.remove(new String("java")); // 이것도 됨
		System.out.println(set.size());
		
		// 검색: 모든 원소 탐색 필요 (for문, iterator -> 순서 보장 X)
		Iterator<String> iter = set.iterator();
		iter.hasNext();
		System.out.println("버린 애: " +iter.next());
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}
}
