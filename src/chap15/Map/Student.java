package chap15.Map;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && name.equals(student.name);
		}
		return false;
	}
	
	public int hashCode() {
		return sno + name.hashCode();
	}
}
