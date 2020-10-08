package chap02.type;

public class TypeCastingEx2 {
	public static void main(String[] args) {
		int intValue = 3;
		long longValue = 55;
		
		// int intValue2 = intValue + longValue; // X 큰 타입으로 변환
		long longValue2 = intValue + longValue;
		
		double doubleValue = 3.14;
		// int intValue3= intValue + doubleVlaue; // X
		double doubleValue2 = intValue + doubleValue;
		
		short shortValue1 = 3;
		short shortValue2 = 5;
		
		// short shortValue3 = shortValue1 + shortValue2; // X 정수형의 연산 결과: int
		int intVlaue4 = shortValue1 + shortValue2;
		
		char c = ' ';
		int a = c;
		System.out.println(a); // 32?
		
		// 현재 줄에 추가 Ctrl + Shift + Enter
		// 다음 줄에 추가 Shift + Enter
	}

}
