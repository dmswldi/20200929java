package chap03;

public class Accuracy {
	public static void main(String[] args) {
		int apple1 = 1;
		double pieceUnit1 = 0.1;
		int number1 = 7;
		
		double result1 = apple1 - number1*pieceUnit1;
		System.out.println(result1);
		
		// 위는 정확도 떨어지는 방법
		
		
		int apple = 1;
		// 다 정수 int로 계산하고
		int totalPieces = apple*10;
		int number = 7;
		int temp = totalPieces - number;
		// 전체값으로 나눠주기
		double result = temp/10.0;
		System.out.println(result);
	}
}
