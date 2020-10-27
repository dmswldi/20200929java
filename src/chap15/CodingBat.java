package chap15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CodingBat {
	public static void main(String[] args) {
		String[] array = { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz", "bz" };
		//String[] result = allSwap(array);
		String[] result = firstSwap(array);
		for (String s : result) {
			System.out.println(s);
		}

	}

	public static String[] allSwap(String[] strings) {
		Map<Integer, Integer> map = new HashMap<>();
		// locatin location

		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if ((strings[i].charAt(0) == strings[j].charAt(0)) && !map.containsValue(i) && !map.containsValue(j)) {// same first char, add condition!!!!!!!!!
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

			// if (map.containsKey(m)) map.remove(m); // ex) (1,3) swap but (3,7) swapX
			// ConcurrentModificationException

			String temp = strings[n];
			strings[n] = strings[m];
			strings[m] = temp;
		}

		return strings;
	}

	// 방법 2: 힌트대로
	public static String[] allSwap2(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if (strings[i].charAt(0) == strings[j].charAt(0) && !map.containsValue(i) && !map.containsValue(j)) {
					map.put(strings[i].substring(0, 1), j);// key's first char, value's index
				}
			}
		}

		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String next = iter.next();
			// 하다 말았다
		}

		return strings;
	}

	// firstSwap
	public static String[] firstSwap(String[] strings) {
		Map<String, Integer> map = new HashMap<>();// first char, 2nd index

		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if (strings[i].charAt(0) == strings[j].charAt(0) && !map.containsKey(strings[i].substring(0, 1))) {
					map.put(strings[i].substring(0, 1), j);
					System.out.println(strings[i].substring(0, 1) + ", " + j);
				}
			}
		}

		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		int location = 0; // loc 1

		while (iter.hasNext()) {
			String next = iter.next();

			for (int i = 0; i < strings.length; i++) {
				if (strings[i].substring(0,1).equals(next)) {
					location = i;
					break;
				}
			}

			String temp = strings[location];
			strings[location] = strings[map.get(next)];
			strings[map.get(next)] = temp;

		}

		return strings;
	}

}
