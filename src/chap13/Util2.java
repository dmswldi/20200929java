package chap13;

public class Util2 {
	public static <T> Box2<T> boxing(T t){ // 메소드 호출 시
		Box2<T> box = new Box2<>(); // Box2 객체 생성
		box.set(t);
		return box;
	}
}
