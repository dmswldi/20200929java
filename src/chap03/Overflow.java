package chap03;
import java.util.Scanner;

public class Overflow {
	public static void main(String[] args) { // main 먼저 실행
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력:");
			int left = sc.nextInt();
			System.out.println("더할 숫자 입력:");
			int right = sc.nextInt();
			int result = safeAdd(left, right);
			// int result = safeAdd(2_000_000_000, 2_000_000_000); // 20억
			System.out.println(result); // safeAdd에서 exception 발생x면 result 출력
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}
	
	
	public static int safeAdd(int left, int right) {
		if(right > 0) {
			if(left > Integer.MAX_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left < Integer.MIN_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}
		
	
}
