package chap10.checkedException;

public class BalanceInsufficientException extends Exception {// 사용자 정의 예외
	// Exception 상속 ->  checked exception -> try-catch()
	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) { super(message); }
}
