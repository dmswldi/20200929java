package chap11.Objects;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableEx {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "jdk", "연구원", new BigInteger("2800")));
		list.add(new Employee(2, "jeong", "선임연구원", new BigInteger("3200")));
		list.add(new Employee(3, "amateur", "연구원", new BigInteger("2800")));
		list.add(new Employee(4, "pro", "수석연구원", new BigInteger("7000")));

		list.forEach(x -> System.out.println(x.no + " " + x.name));// 넣은 순서대로
		Collections.sort(list);
		System.out.println("\n정렬 후");
		list.forEach(x -> System.out.println(x.no + " " + x.name));// no 순서대로

		
		System.out.println("---------------");

		List<Student> list2 = new ArrayList<>();
		list2.add(new Student(15, "choi"));
		list2.add(new Student(20, "lee"));
		list2.add(new Student(12, "park"));
		list2.add(new Student(9, "kim"));

		System.out.println("정렬 전");
		list2.forEach(x -> System.out.println(x.name + " : " + x.score));

		System.out.println("\n정렬 후");
		Collections.sort(list2);
		list2.forEach(x -> System.out.println(x.name + " : " + x.score));
		
		
		System.out.println("---------------");
		
		Collections.sort(list2, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				/*
				if(o1.score > o2.score) return 1;
				if(o1.score < o2.score) return -1;
				return 0;
				*/
				//return Integer.compare(o1.score, o2.score);
				return o1.name.compareTo(o2.name);
				// int는 Integer.compare(i1, i2) | String은 s1.compareTo(s2)
			}
		});
		list2.forEach(x -> System.out.println(x.name + " : " + x.score));

	}
}

class Employee implements Comparable<Employee> {
	int no;
	String name;
	String position;
	BigInteger income;

	Employee(int no, String name, String position, BigInteger income) {
		this.no = no;
		this.name = name;
		this.position = position;
		this.income = income;
	}

	@Override
	public int compareTo(Employee o) {
		//return this.no - o.no;
		return this.name.compareTo(o.name);
	}

}

class Student implements Comparable<Student> {
	String name;
	int score;

	public Student(int score, String name) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {// 상속 후 재정의, 정렬 기준 바뀔 때마다 재정의 -> 비효율적 
		return this.score - o.score;// 양수면 크니까 뒤로
		//return this.name.compareTo(o.name);// String.compareTo() : this.name - o.name
		// 양수면 z에 가까우니까 반대 방향, 오름차: 대문자-소문자 순, A-Z a-z 순서
	}

	@Override
	public String toString() {
		return score + "," + name;
	}

}
