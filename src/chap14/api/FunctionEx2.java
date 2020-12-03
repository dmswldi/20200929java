package chap14.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FunctionEx2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();// <K, V>
		
		map.put("java", 20);
		map.put("html", 55);
		map.put("css", 2);
		map.put("jquery", 1);
		map.put("dbms", 7);
		map.put("mysql", 99);
		
		
		// BiFunction의 apply() 정의, 해당 (k, v)의 v를 바꿔줌
		map.replaceAll((k, v) -> v * 2);// 값 바꿔주기 BiFunction<? super K, ? super V, ? extends V>
		// BiFunction<T, U> -> apply(T, U) 타입값 정의!,  apply 타입에 뭐가오든 BiFunction 적용 가능해야, 즉 Map<K, V> 적용 가능해야 함
		map.replaceAll((Object k, Integer v) -> 3); // apply(T, U), <String, Integer>가 항상 들어갈 수 있을 만큼 큰 상위 타입!
		// k(T)에는 string, object 올 수 있고
		// v(U)에는 int, number 올 수 있고
		// 리턴값으로는 int의 자식들 <- v에 뭐가 오든 받을 수 있는 타입
		// 리턴값은 결국 map의 value 값이 되므로 결국엔 Integer로 변환 가능해야 함
		
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		System.out.println("============"); // 위 두 줄과 아래는 같은 표현
		
		// 풀어서 써보기
		Set<String> keys = map.keySet();
		for(String key : keys) {
			int v = map.get(key);
			map.put(key, v*2);
			System.out.println(key + ":" + map.get(key));
		}
	}
}
