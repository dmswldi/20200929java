package chap14.excercise;

import java.util.function.IntBinaryOperator;

public class LambdaEx2 {// 5
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(IntBinaryOperator operator) {// int 2개 계산 int return
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);// apply 내용은 아직 안 정했지만 apply를 할 거야!
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrMin(
			//(x, y) -> 0
			(x, y) -> {
				if(x >= y) return x;
				else return y;
			}
		);
		System.out.println("최대값: " + max);
		
		int min = maxOrMin(
			(x, y) -> {
				if(x < y) return x;
				else return y;
			}
		);
		System.out.println("최소값: " + min);
	}

}
