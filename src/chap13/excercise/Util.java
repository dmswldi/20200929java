package chap13.excercise;

public class Util {

	public static <K, V> V getValue(Pair<K, V> pair, K k) {// �Ű������� Pair ����Ÿ��
		if(pair.getKey() == k) {
			return pair.getValue();
		}
		return null;
	}

}
