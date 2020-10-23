package chap11.Objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class CompareEx {// Comparator: -1, 0, 1 리턴값 만들어 기준 두어 정렬!
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "김자바");
		Student s3 = new Student(2, "양양");
		
		/*List<Student> list = new ArrayList<>(); // ?
		list.add(s1);
		list.add(s2);
		list.add(s3);*/
		
//		System.out.println(list); // 원본
//		Collections.sort(list);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
		
		// 2 익명 구현 객체
		//Comparator<Student> StudentsComparator
		
	}
	
	
	static class Student {
		int sno;
		String name;
		
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		
	}
	
	static class StudentComparator implements Comparator<Student>{
		public int compare(Student o1, Student o2) {
			/* if(o1.sno < o2.sno) return -1;
			else if(o1.sno == o2.sno) return 0;
			else return 1; */
			return Integer.compare(o1.sno, o2.sno);
		}
	}
	
}

