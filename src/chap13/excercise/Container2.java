package chap13.excercise;

public class Container2<K, V> {
	private K k;
	private V v;
	
	void set(K k, V v) {
		this.k = k;
		this.v = v;
	}
	
	K getKey() {
		return this.k;
	}
	
	V getValue() {
		return this.v;
	}
}
