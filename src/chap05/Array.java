package chap05;

public class Array {
	// static int k = 0;
	
	public static void main(String[] args) {
		int[] scores; 
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87}); // or Array.add()
		System.out.println("총합: " + sum2);
		
		// int sum3 = add2(new int[] {83, 90, 87}); // static method 아니면 같은 클래스 내에서도 참조X -> 객체 생성해야 함
		Array arr = new Array();
		System.out.println("static 아닌 일반 메소드: " +arr.add2(scores));
		
		
		int[] arr1 = new int[3]; // int array: 0으로 초기화
		for(int i = 0; i < 3; i ++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3]; // Double array: 0.0으로 초기화
		for(int i = 0; i < 3; i ++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3]; // String array: null로 초기화
		for(int i = 0; i < 3; i ++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		char[] arr4 = new char[3]; // char array: '\u0000'으로 초기화
		for(int i = 0; i < 3; i ++) {
			System.out.println("arr4[" + i + "] : " + arr4[i]);
		}
		char a = '\u0000'; // == Character.MIN_VALUE
		char b = ' '; // '\u0020'
		System.out.println("\\u" + Integer.toHexString(' ' | 0x10000).substring(1));
		if(a == Character.MIN_VALUE)
			System.out.println("공백");
	}
	
	/* static method : 클래스의 인스턴스(객체 생성) 없이! 호출 가능 class.method(), 인스턴스에서 호출x
	   유틸리티 함수 만들 때 사용 */
	/* 유틸리티 클래스 : 상태를 가지고 있지 않는 클래스
	   정적 메소드만을 가지고 있고, 상태를 내포하지 않고 단순히 메소드만 가지는 "구조"이다 -> 적절한 객체가 아님 
	   -> 정적 메소드, 즉 절차적 메소드를 호출하는 대신, 요구하는 행동을 제공할 수 있는 객체를 생성해야 한다 */
	public static int add(int[] scores) { // static 선언
		// System.out.println(k);
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	public int add2(int[] scores) { // static 선언
		// System.out.println(k);
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
