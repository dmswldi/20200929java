package chap14.excercise;

import java.util.function.ToDoubleFunction;

public class LambdaEx3 {// 6
	private static Student[] students = {// 여기서 쓰려고 static class로 선언
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	public static double avg(ToDoubleFunction<Student> function) {
		int sum = 0;
		for(Student s : students) {
			sum += function.applyAsDouble(s);// s를 받아서 applyAsDouble을 할 거야
		}
		return sum / 2.0;
	}
		
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());// 매개변수 객체 하나, 리턴 int
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}
	
	static class Student {// 중첩 class, static
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName() { return name; }
		public int getEnglishScore() { return englishScore; }
		public int getMathScore() { return mathScore; }
	}
}