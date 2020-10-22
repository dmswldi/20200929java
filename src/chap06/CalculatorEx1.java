package chap06;

public class CalculatorEx1 {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); //  byte는 int로 자동 형변환
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
		
		
		System.out.println("==========");
		// 추가
		Calculator myCalc2 = new Calculator();
		myCalc2.execute(); // 클래스 내부에서 메소드 호출
		
		
		System.out.println("==========");
		// 추추가
		
		Calculator myCalcu = new Calculator();
		
		double result3 = myCalcu.areaRectangle(10);
		double result4 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = " + result3);
		System.out.println("직사각형 넓이 = " + result4);
		
		
		System.out.println("==========");
		// 추추추가 : static (클래스 멤버), 객체 생성 없이.
		double result5 = 10 * 10 * Calculator.pi;
		int result6 = Calculator.plus(10, 5);
		int result7 = Calculator.minus(10, 5);
		
		System.out.println("result5: " + result5);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
	}
}
