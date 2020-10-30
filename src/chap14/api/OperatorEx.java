package chap14.api;

import java.util.function.IntBinaryOperator;

public class OperatorEx {
	private static int[] scores = {92, 95, 87};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);// int 2개 받아서 int 리턴
		}
		return result;
	}
	
	
	public static void main(String[] args) {// 함수 안에 필드 정의 X...
//		static int x = 2;//final만 된대 ...??? 중첩 어쩌고 다시 공부
		int max = maxOrMin(
			(a, b) -> {
				if(a >= b) return a;
				return b;
			}
		);
		System.out.println("최대값: " + max);
		
		int min = maxOrMin(
				(a, b) -> {
					if(a <= b) return a;
					return b;
				}
		);
		System.out.println("최소값: " + min);
	}
}