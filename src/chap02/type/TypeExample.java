package chap02.type;

public class TypeExample {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128;
		//byte -128 ~ 127
		
		System.out.println(var1+" "+var2+" "+var3+" "+var4+" "+var5);
		
		
		char c1 = 'A';
		char c2 = 65; // 10진수
		char c3 = '\u0041'; // 16진수
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int uniCode = c1; // int 타입으로 받아 유니코드 얻기
		
		System.out.println(c1+" "+c2+" "+c3+" "+c4+"\t"+c5+"\r\n"+c6+"\r\n"+uniCode);
		
		long v1 = 10000000000L; // 뒤에 L을 붙여 long타입임을 인지시킴
		/* 정리)
		1 byte = 8 bit
		
		1. 정수 타입
		byte: -128 ~ 127(0111 1111) = 2^8 = 8bit
		
		char: 0 ~ 65,535 = 2byte
		short: -32,768 ~ 32767 = 2byte C언어와 호환을 위해 사용, 자주x
		
		int: -2^31 ~ 2^31-1 = 4byte = 32bit = 2^32 플마21억 정도
		long: -2^64 ~ 2^63-1 = 8byte = 64bit = 2^64 은행 및 우주 관련 프로그램, int 범위 넘으면 L붙이기
		
		2. 실수 타입 // undo redo ctrl+Y
		float: = 4byte = 32bit 중 1bit 부호, 8bit 지수, 23bit 가수
		double: = 8byte  = 64bit 중 1bit 부호, 11bit 지수, 52bit 가수 => 기본 타입		*/
		
		float f1 = 3.14f; // f 붙여주기
	}
}
