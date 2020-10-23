package chap15.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		// (Key, Value)쌍: Entry
		// dictionary
		Map<Integer, String> map = new HashMap<>();  
		
		// 추가
		map.put(100, "kim");
		map.put(30, "hong");
		map.put(22, "lee");
		map.put(11, "choi");
		map.put(200,"jin");
		
		System.out.println(map.size());
		
		// 수정
		map.put(200, "park");
		System.out.println(map.size());
		
		// 검색: key 값으로 검색
		String v1 = map.get(100);
		System.out.println(v1);
		
		// 삭제: key로 삭제
		map.remove(200);
		System.out.println(map.size());
		
		// 전체 탐색
		System.out.println("향상된 for문");
		Set<Integer> keys = map.keySet(); // key 타입의 Set 리턴
		for (Integer key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("향상된 for / entrySet");
		Set<Map.Entry<Integer, String>> entrys = map.entrySet();// Map.Entry 타입
		for(Map.Entry<Integer, String> entry : entrys) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
	}
}
