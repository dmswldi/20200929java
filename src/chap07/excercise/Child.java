package chap07.excercise;

public class Child extends Parent {
	// 6
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
