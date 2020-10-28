package chap18.filterstream;

import java.util.Date;

public class PrintEx {
	public static void main(String[] args) {
		System.out.printf("상품의 가격: %d원\n", 123);// format String 포함 (%~)
		System.out.printf("상품의 가격: %6d원\n", 123);// 6칸 만들어서 뒤에 붙여 입력
		System.out.printf("상품의 가격: %-6d원\n", 123);// 앞에 붙여 입력
		System.out.printf("상품의 가격: %06d원\n", 123);// 0 붙이기
		
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, Math.PI*10*10);
		
		System.out.printf("%6d | %-10s | %10s\n", 1, "홍길동", "도적");// String은 s
		
		Date now = new Date();
		System.out.printf("오늘은 %tY년 %tm월 %td일입니다\n", now, now, now);
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일입니다\n", now);// 1$ : 첫 번째 파라미터 !
		System.out.printf("현재 %1$tH시 %1$tM분 $1$tM분 $1$tS초입니다\n", now);
		
		
		
		// VarArgEx
		method();
		method(1);
		method(1, 2);
	}
	
	public static void method(int... nums) {// 0개 이상
		for(int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
