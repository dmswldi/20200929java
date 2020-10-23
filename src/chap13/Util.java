package chap13;

public class Util {
	// 파라미터로 숫자만 받으려면!
	public static <T extends Number> int compare(T t1, T t2) { // T는 Number의 자식 메소드 무엇이든 될 수 있다! (자식 extends 부모)
		// <Number>은 그냥 변수. 아무 타입. 객체 생성할 때 <Number> 넣으면 그 때 넘버 타입!!!!!!!
		System.out.println(t1.getClass().getName());
		double v1 = t1.doubleValue(); // 언박싱
		Double v2 = t2.doubleValue();
		
		// t1.isInfinite();
		// t2.isInfinite(); // 타입 파라미터 변수로 하위 타입(여기선 Double)에만 있는 필, 메 사용 불가!
		
		// v1.isInfinite();
		v2.isInfinite();
		
		return Double.compare(v1, v2);
	}
}