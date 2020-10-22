package chap07;

public class Computer extends Calculator {
	@Override
	double areaCircle(double a) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * a * a;
	}
}
