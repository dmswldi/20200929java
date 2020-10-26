package chap15.excercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx { // 9
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		
		// entrySet()
		if(map != null) {
//			// 1 iterator
//			Set<Map.Entry<String, Integer>> entry = map.entrySet(); // 전체 Map.Entry 객체
//			Iterator<Map.Entry<String, Integer>> entryIterator = entry.iterator();
//			while(entryIterator.hasNext()) {
//				Map.Entry<String, Integer> next = entryIterator.next();
//				totalScore += next.getValue();
//				
//				if(next.getValue() > maxScore) {
//					maxScore = next.getValue();
//					name = next.getKey();
//				}
//			}
			
			// 2 향상된 for
			for(Map.Entry<String, Integer> entry2 : map.entrySet()) {
				totalScore += entry2.getValue();
				if(entry2.getValue() > maxScore) {
					maxScore = entry2.getValue();
					name = entry2.getKey();
				}
				
			}
			System.out.println("평균점수: " + totalScore/map.size());
			System.out.println("최고점수: " + maxScore);
			System.out.println("최고점수를 받은 아이디: " + name);
		}
		
		
		name = null;
		maxScore = 0;
		totalScore = 0;
		
		// keySet()
		Set<String> keys = map.keySet();
		for(String key : keys) {
			totalScore += map.get(key);
			if(map.get(key) > maxScore) {
				maxScore = map.get(key);
				name = key;
			}
		}
		System.out.println("평균점수: " + totalScore/map.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
		
	}
}
