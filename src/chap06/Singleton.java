package chap06;

public class Singleton {
	// 자기 자신 객체 생성, private으로 외부에서 필드값 변경 못하도록.
	private static Singleton singleton1 = new Singleton();
	
	// 생성자 : private으로 객체 생성 못하도록
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton1;
	}
}
