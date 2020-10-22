package chap09;

public class MessageListener implements Button.OnClickListener {
	// 인터페이스 구현
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}
