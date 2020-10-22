package chap07.excercise;

public class Parent {
	// 6
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
	
}
