package chap06;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// 가변 길이 인수 -> 배열 타입
	int sum2(int ... values) {
		int sum = 0;
		for(int x : values) {
			sum += x;
		}
		return sum;
	}
}
