package chap09;

public class CallListener implements Button.OnClickListener {
	// 인터페이스 구현
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
	
}
