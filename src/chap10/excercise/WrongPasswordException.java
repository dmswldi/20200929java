package chap10.excercise;

public class WrongPasswordException extends Exception {// 사용자 정의 예외 클래스
	public WrongPasswordException() { }
	public WrongPasswordException(String message) { super(message); }
}
