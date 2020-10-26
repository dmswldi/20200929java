package chap13.wildCards;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity]; // 걍 똑같은데 안전성이 뭐가 달라??? 굳이 왜 extract 하라고 함?
	}
	
	public String getName() { return name; }
	public T[] getStudents() { return students; }
	
	// 빈 배열 처음에 수강생 추가
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	

}

class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}

class Worker extends Person {
	public Worker(String name) {
		super(name);
	}
}

class Student extends Person {
	public Student(String name) {
		super(name);
	}
}

class HighStudent extends Student {
	public HighStudent(String name) {
		super(name);
	}
}