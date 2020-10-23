package chap13.excercise;

public class Container<T> {
	private T t;
	
	void set(T t) {
		this.t = t;
	}
	
	T get() {
		return this.t;
	}
}
