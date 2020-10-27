package chap15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class CodingBatRetry {
		public static void main(String[] args) {
			String[] array = { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
			String[] result = allSwap(array);
			for (String s : result) {
				System.out.println(s);
			}

		}

		public static String[] allSwap(String[] strings) {
			Map<Integer, Integer> map = new HashMap<>();
			// locatin location

			for (int i = 0; i < strings.length - 1; i++) {
				for (int j = i + 1; j < strings.length; j++) {
					if ((strings[i].charAt(0) == strings[j].charAt(0))) {// same first char
						map.put(i, j); // swapped location
						System.out.println("(" + i + ", " + j + ")");
						break;
					}
				}
			}
			System.out.println("----------");
			// swap
			Set<Integer> keys = map.keySet();
			Iterator<Integer> iter = keys.iterator();

			while (iter.hasNext()) {
				int n = iter.next(); // key location
				int m = map.get(n); // value location
				System.out.println("(" + n + ", " + m + ")");
				int mexist = -1;
				if(map.containsValue(n)) mexist = n; // 내 key(현재 iterator 위치의 키, n)가 value로 있으면 나 삭제
				if ( mexist != -1) { // ex) (1,3) swap but (3,7) swapX
					System.out.println(n);
					iter.remove(); // 얘는 swap 하면 안 되는데...
				}
				// ConcurrentModificationException: iterator.remove()로 해결
				if(mexist == -1) {
					String temp = strings[n];
					strings[n] = strings[m];
					strings[m] = temp;
				}
			}

			return strings;
		}



		
	}
