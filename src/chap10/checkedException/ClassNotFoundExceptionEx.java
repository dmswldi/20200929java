package chap10.checkedException;

public class ClassNotFoundExceptionEx { // 컴파일러가 체크 (일반 예외, 컴파일러 체크 예외)
	public static void main(String[] args) {
		// Class clazz = Class.forName("java.lang.String");
		// Class<?> stringClass = Class.forName("java.lang.String");
		try {
			Class.forName("java.lang.String2");
			System.out.println("프로그램 실행 try");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally { // return 발생해도 실행됨
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 실행");
	}
}
