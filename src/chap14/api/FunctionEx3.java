package chap14.api;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FunctionEx3 {
	public static void main(String[] args) throws IOException {// CodingBat-Map2: wordCount()
		String path = "src/chap14/api/FunctionEx3.java";
		FileReader fr = new FileReader(path);
		
		Map<Character, Integer> map = new HashMap<>();
		
		int ch;
		while((ch = fr.read()) != -1) {
			if(('a' <= ch && ch <= 'z')||('A' <= ch && ch <= 'Z')) {
				char c = (char) ch;
				//System.out.print(c);
				
				map.compute(c, map.containsKey(c)? (k,v) -> v+1 : (k,v) -> 1); // 어떤 알파벳이 몇 개?
//				map.compute(c, (k,v) -> v == null? 1 : v+1); // 선생님 코드
			}
		}
		
		fr.close();	
		
		
		// map print
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		System.out.println("===");
		System.out.println("===");
		
		// Test
		Map<Character, Integer> map2 = new HashMap<>();
		// 값 람다식으로 put하는 방법? a~c까지 value2로 넣고 싶은데 -> 16장 공부 후 해보기!!!!!!!!
		map2.put('a', 2);
		map2.put('b', 2);
		char c = ' ';
		if(('a' <= c && c <= 'z')||('A' <= c && c <= 'Z')) {
			c = (char) c;
			map2.compute(c, map2.containsKey(c)? (k,v) -> v+1 : (k,v) -> 1);
		}
		map2.forEach((k, v) -> System.out.println(k + ":" + v));
	}
}
