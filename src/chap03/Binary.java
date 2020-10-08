package chap03;

public class Binary {
	public static void main(String[] args) {
		char c1 = 'A' + 1; // B
		char c2 = 'A';
		// char c3 = c2 + 1; // 결과는 int
		char c3 = (char) (c2 + 1);
		System.out.println(c3);
		System.out.println("\u263a");
		System.out.println("0x1F606"); // ?????????
		
		int a = 3;
		int b = 5;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a >= b);
		
		double c = 3.0;
		System.out.println(a == c); // T, 큰 타입으로 변환하여 비교
		
		// float과 double 비교
		float d = 0.1F; // 0.1000...149011612
		double e = 0.1;
		System.out.println(d == e); // F, 실수는 근사치 저장이라 같지 않을 수 있음
		System.out.println(d == (float)e); // T, 둘 다 float으로 바꿔 비교
		System.out.println((int)(d*10) == (int)(e*10)); // T, 정수로 변환 비교
	}
}
