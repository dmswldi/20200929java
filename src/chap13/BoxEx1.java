package chap13;

public class BoxEx1 {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		
		// String name = (String) box.get();
		Object o = box.get();
		
		if(o instanceof String) { // 캐스팅 전 instanceof 타입 확인
			String name = (String) o;
		}
		
		box.set(new Apple());
		// Apple apple = (Apple) box.get();
		Object o2 = box.get();
		if(o2 instanceof Apple) {
			Apple apple = (Apple) o2;
		}
		
	}
}

class Apple {
	
}
