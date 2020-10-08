package chap04;

public class SwitchEx {
	public static void main(String[] args) {
		// No break Switch
		int time = (int)(Math.random()*4) + 8; // 8~11 정수
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
				//break; // 넣어도 똑같은데 왜 안 넣지?
		}
		
		// 중복 switch
		char grade = 'B';
		
		switch(grade){
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다."); // default에는 break 붙이나마나?
		}
		
		
		// 합
		int sum = 0;
		int i = 0;
		for (i=1; i<=100; i++)
			sum += i;
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
		
		// 부동 소수점 -> low accuracy로 반복문 제대로 X 
		// float
		for(float x = 0.1F; x<=1.0F; x+=0.1F) { // 0.1F > 0.1 -> 루프 9번
			System.out.println(x);
		}
		// double
		for(double x = 0.1; x<=1.0; x+=0.1) {
			System.out.println(x);
		}
		
		
		// 구구단
		for(int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단" + " ***");
			for(int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + m*n);
			}
		}
	}
}
