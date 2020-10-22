package chap08;

public class RemoteControlEx1 {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		// 인터페이스 변수에 구현 객체를 대입
		rc = new Television(); 
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		RemoteControl.changeBattery(); // static method 호출
		System.out.println("---------");
		
		// 익명 구현 클래스 : Television, Audio 같은 구현 클래스 없이 작성
		RemoteControl rc1 = new RemoteControl() {
			public void turnOn() { System.out.println("켭니다."); } // 실체 메소드 작성
			public void turnOff() { System.out.println("끕니다."); }
			public void setVolume(int Volume) {  }
		};
		rc1.turnOn();
		rc1.turnOff();
	}
}
