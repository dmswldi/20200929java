package chap10.excercise;

public class NotExistIDException extends Exception {// 사용자 정의 예외 클래스, 생성자 2개 선언
	public NotExistIDException() { }
	public NotExistIDException(String message) { super(message); }
	// 상위 클래스 생성자 호출 -> 예외 메시지 넘겨줌
	// 메시지는 자동적으로 예외 객체 내부에 저장됨
	// NotExistIDException.getMeassage()하면 throw new Exception하며 저장된 메시지 리턴 
}
