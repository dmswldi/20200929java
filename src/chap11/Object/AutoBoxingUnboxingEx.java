package chap11.Object;

public class AutoBoxingUnboxingEx {
	public static void main(String[] args) {
		// Boxing: 참조 타입 -> 기본 타입
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		// Unboxing: 기본 타입 -> 참조 타입
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		System.out.println("---------");
		// 자동 박싱
		Integer obj = 100;
		System.out.println("value: " + obj.intValue()); 
		
		// 자동 언박싱
		int value = obj;
		System.out.println("value: " + value);
		
		// 연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result );
		
		
		
		// 문자열을 기본 타입으로 변환
		System.out.println("---------");
		byte b1 = Byte.parseByte("10");
		System.out.println("b1: " + b1);
		int val1 = Integer.parseInt("10"); // 기본 타입 int 리턴
		Integer v1 = Integer.parseInt("10"); // auto boxing 일어나니까 이것도 ok
		double val2 = Double.parseDouble("3.14");
		boolean val3 = Boolean.parseBoolean("true");
		
		int i = Integer.valueOf("10"); // 참조 타입 리턴, 자동 언박싱
		
		System.out.println("value1: " + val1);
		System.out.println("value2: " + val2);
		System.out.println("value3: " + val3);
		
		
		System.out.println("---------");
		System.out.println("[-128~127 초과값일 경우]"); // -> 언박싱 후 비교하거나 equals 이용해서 값 비교해야 함
		Integer ob1 = 300; // 박싱한 300 -> 참조 타입
		Integer ob2 = 300;
		System.out.println("==결과: " + (ob1 == ob2)); // 참조값 비교
		System.out.println("언박싱후 ==결과: " + (ob1.intValue() == ob2.intValue()));
		System.out.println("equals() 결과: " + ob1.equals(ob2));
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]"); // byte, short, int -> 박싱된 채 ==, != 사용 가능
		Integer ob3 = 10;
		Integer ob4 = 10;
		System.out.println("==결과: " + (ob3 == ob4));
		System.out.println("언박싱후 ==결과: " + (ob3.intValue() == ob4.intValue())); // 내부 값 비교
		System.out.println("equals() 결과: " + ob3.equals(ob4)); // 내부 값 비교
	}
	
	
	public int byteArrayToInt(byte bytes[]) {
		return ((((int)bytes[0] & 0xff) << 24) |
				(((int)bytes[1] & 0xff) << 16) |
				(((int)bytes[2] & 0xff) << 8) |
				(((int)bytes[3] & 0xff)));
	} 


}



