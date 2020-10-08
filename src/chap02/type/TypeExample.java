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
		
		System.out.println(c1+" "+c2+" "+c3+" "+c4+"\t"+c5+"\r"+c6+"\r\n"+uniCode);
		
		long v1 = 10_000_000_000L; // 뒤에 L을 붙여 long타입임을 인지시킴, 숫자 반점 대신 _ 사용
		System.out.println(v1);
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
		
		/* 타입 변환)
		 묵시적(자동)변환 / 명시적(강제)변환
		 1. 자동 타입 변환 : 작은 크기 타입 -> 큰 크기 타입
		 byte(1) > short(2) > int(4) > long(8) > float(4) > double(8)
		 - byte->char(X) : char은 음수 저장x이기 떄문
		 2. 강제 타입 변환 (캐스팅) : 보존 or not 
		 */
		byte b = 10;
		int i = b; // 자동 타입 변환
		
		// 타입 변환 전 데이터 손실 여부 체크
		int i2 = 128;
		if (i2 < Byte.MIN_VALUE || i2 > Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		} else {
			byte b2 = (byte) i2;
			System.out.println(b2);
		}
		
		// 정밀도 손실을 피하기 위해 float 대신 double 사용
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2; // float으로 변경 시 데이터 손실, 가수의 표현 한계(23bit)
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result); // 데이터 손실 -4
		
		// 정수 연산일 경우 int 타입이 기본
		// 연산자 중 데이터 크기가 큰 타입으로 결과 산출됨
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1+byteValue2; => int 타입을 byte로 x
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2; // 65+1
		char charValue3 = (char)intValue2;
		System.out.println("유니코드:" + intValue2 + ", 출력문자:" + charValue3);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4; // 2.xx
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intVlaue6 = intValue5/4.0; //컴파일 에러 double->int
		double doubleValue = intValue5/4.0;
		System.out.println(doubleValue);
		
		String str = "A";
		//char var = (char)str; X
		
		//byte re = byteValue1 + byteValue1; //int->byte (X)
		
		
	}
}
