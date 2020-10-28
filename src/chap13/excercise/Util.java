package chap13.excercise;

public class Util {

	public static <K, V> V getValue(Pair<K, V> pair, K k) {// 매개변수로 Pair 하위타입
		if(pair.getKey() == k) {
			return pair.getValue();
		}
		return null;
	}

}
