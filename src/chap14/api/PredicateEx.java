package chap14.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {// 람다식 풀어서 써보기!!!!!!!!!!
//	static PredicateEx p = new PredicateEx();// ...이게 되네?
	private static List<Student> list = Arrays.asList(
//			p.new Student("홍길동", "남자", 90),
		new Student("홍길동", "남자", 90),
		new Student("김순희", "여자", 90),
		new Student("김자바", "남자", 95),
		new Student("박한나", "여자", 92)
	);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {// 리스트 다 돌려서
			if(predicate.test(student)) {// student를 검사하는 일 맡음, 해당 타입을 받아서 test()로 filter -> T/F
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));// 익명 객체, t는 test 대상인 student, test() 오버라이드 한 것!!!
		System.out.println("남자 평균 점수: " + maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg);
	}
	
	
	static class Student {// static 함수에서는 static(class)만 접근 가능, static 선언으로 미리 메모리에 올려놓기
		// static 아니면 PredicateEx 객체 생성 후 Student 객체 생성 가능!
		private String name;
		private String sex;
		private int score;
		
		public Student(String name, String sex, int score) {
			this.name = name;
			this.sex = sex;
			this.score = score;
		}
		
		public String getSex() { return sex; }
		public int getScore() { return score; }
	}
	

}