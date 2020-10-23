package chap13;

public class BoxingMethodEx1 {
	public static void main(String[] args) {
		Box2<Integer> box1 = Util2.<Integer>boxing(100); // 뒤 <Integer> 생략 , static 함수 호출
		int intValue = box1.get();
		
		Box2<String> box2 = Util2.boxing("홍길동");
		String strValue = box2.get();
	}
}
