package chap13;

public class MyClass2<T extends Number> {
	void method1(T t) {
		System.out.println(t.doubleValue());
	}
}
