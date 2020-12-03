package chap14.excercise;

import java.util.function.ToDoubleFunction;

import chap14.excercise.LambdaEx3.Student;

public class LambdaEx4 {// 7
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	public static double avg(ToDoubleFunction<Student> function) {// 함수 정해져 있으니까 매개값, 리턴값만 정의해주면 됨
		int sum = 0;
		for(Student s : students) {
			sum += function.applyAsDouble(s);		
		}
		return sum / 2.0;
	}
		
	public static void main(String[] args) {
		double englishAvg = avg(Student :: getEnglishScore);// 매개값(매개 객체) :: 리턴값
		System.out.println("영어 평균 점수: " +
		englishAvg);
		
		double mathAvg = avg(Student :: getMathScore);
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}
