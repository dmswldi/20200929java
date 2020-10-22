package chap07;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() { // 추상 메소드 재정의 (overriding)
		System.out.println("야옹");
	}
}
