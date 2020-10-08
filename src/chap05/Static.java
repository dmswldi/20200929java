package chap05;

public class Static {
	//public static final String name = "Eunji";
	
	
	public static void main(String[] args) {
		String a = "hi there";
		System.out.println(a);
		//a = a.substring(1,a.length()-1);
		//a = a.substring(0, a.length()
		a= a.substring(0, 2).toUpperCase();
				//String last = a.charAt(a.length()-1);
		System.out.println(a);
		
		
		// 다른 class의 static method 사용
		int[] ex = {1, 2};
		System.out.println(Array.add(ex)); // Array class의 add 함수
		// System.out.println(Array.add2(ex)); // static method 아닌 거 참조 못함
		
		Array arr = new Array(); // 클래스 인스턴스 (객체) 생성
		arr.add2(ex);
		// arr.add(ex); // X, 대신 Array.add(ex)로 호출
	}
}
