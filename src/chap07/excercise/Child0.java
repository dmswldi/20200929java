package chap07.excercise;

public class Child0 extends Parent0 {
	// 5
	private int studentNo;
	
	public Child0(String name, int studentNo) {
		super(name); // 추가함으로써 에러 수정
		this.name = name;
		this.studentNo = studentNo;
	}
}
