package chap13;

public class BoundedTypeParameterEx {// compare()는 <T extends Number> 타입
	public static void main(String[] args) {
		// String str = BUtil.compare("a", "b");
		
		int result1 = Util.compare(10, 20);// Integer로 자동 boxing
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 4.4);// double->Double로 자동 boxing
		System.out.println(result2);
	}
}
