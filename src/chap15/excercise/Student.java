package chap15.excercise;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
//		return studentNum + name.hashCode();
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student) obj;
//			return (st.studentNum == studentNum) && (st.name.equals(name));
			return st.studentNum == studentNum;
		}
		return false;
	}
}
