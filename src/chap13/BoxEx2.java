package chap13;

public class BoxEx2 {
	public static void main(String[] args) {
		Box2<String> box1 = new Box2<>();
		box1.set("hello");
		String str = box1.get();
		
		Box2<Integer> box2 = new Box2<>();
		box2.set(6);
		int value = box2.get();
	}
}
