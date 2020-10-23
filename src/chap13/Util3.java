package chap13;

public class Util3 {
	// Key와 Value가 모두 같아야 같음
	public static <K, V> boolean compare(Pair3<K, V> p1, Pair3<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey()); // equals 동일한 객체면 true, Integer와 String은 같은 값 가지면 true
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
 }
