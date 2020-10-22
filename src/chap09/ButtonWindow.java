package chap09;

public class ButtonWindow {
	Button button1 = new Button(); // 필드로 익명 객체 대입
	Button button2 = new Button(); // 매개값으로 익명 객체 대입
	
	// 필드
	Button.OnClickListener listener = new Button.OnClickListener() { // 인터페이스 구현 클래스 { }
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	// 생성자
	ButtonWindow(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() { // 인터페이스 구현 클래스 { }
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}	
		});
	}
	
	
}
