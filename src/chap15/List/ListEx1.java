package chap15.List;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// 추가
		list.add("자바");
		list.add("html");
		list.add("python");
		
		System.out.println(list.size());
		
		// 검색
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		
		
		// 수정
		list.set(1, "jsp");
		System.out.println(list);
		
		// 삭제 -> 빈 배열 채워짐
		list.remove(2);
		System.out.println(list);
		
		
		// 모든 값 탐색
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String s : list) {
			System.out.println(s);
		}
		
		
		List<Integer> listInt = new ArrayList<>();
		// 해당 타입이나 하위 클래스 타입을 넣을 수 있음!
		list.add("servlet");
		listInt.add(3);
		
		
		// 타입 파라미터 X -> Object 타입 받을 수 있음
		List listNotype = new ArrayList();
		listNotype.add("string");
		listNotype.add(3);
		
		Object o1 = listNotype.get(0);
		Object o2 = listNotype.get(1); // 캐스팅 해서 써야 해서 위험!
	}
}
