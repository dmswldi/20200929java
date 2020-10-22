package chap07;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 명시적 부모 생성자 호출
		this.studentNo = studentNo;
	}
}
