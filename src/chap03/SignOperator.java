package chap03;

public class SignOperator {
	public static void main(String[] args) {
		int intVar1 = +3;
		int intVar2 = -3;
		int intVar3 = -intVar2;
		
		short s = 100;
		// short result3 = -s; // 연산 결과는 int
		int result3 = -s;
		System.out.println(result3);
		
		// 증가, 감소 연산자
		int var1 = 5;
		int var2 = 5;
		
		// var1 ++; var2 --; // 사용한 후 할당
		++var1; --var2; // 할당 후 사용
		System.out.println(var1 + ", " + var2);
		
		int var3 = 5;
		int var4 = 5;
		int var5 = 3 +(var3++); // 3+5=8이 되고 ++
		System.out.println(var5);
		
//		int var6 = 3 + (++var4); // ++하고 3+6=9
//		System.out.println(var6);
		// 쉽게 써라
		var4 ++;
		int var6 = 3 + var4;
		System.out.println(var6);
		
		// 논리 연산자 not
		boolean va1 = true;
		boolean va2 = !va1;
		System.out.println(va2);
		
		
		System.out.println("=========");
		// 비트 연산자 ~
		byte v = 10; // 1010 -> 1...1_0110
		System.out.println(Integer.toBinaryString(10)); // 1010, 32bit의 이진 문자열로 리턴
		System.out.println(~v); // -11
		System.out.println(Integer.toBinaryString(~v));
		//System.out.println(Integer.parseInt("11111111111111111111111111110110", 2));
		int vv = ~v + 1; // == -v 부호 반대인 정수 얻기
		System.out.println(vv);
		
		
		System.out.println("=========");
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 +1; // 2의 보수
		System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 +1;
		System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")");
		
		// 8과 -8의 binary 표현이 같다 , 부호 다름
	}

	private static String toBinaryString(int v) {
		// TODO Auto-generated method stub
		String str = Integer.toBinaryString(v);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
