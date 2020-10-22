package chap08;

public interface RemoteControl {
	// 상수 : 컴파일 시 알아서 public static final 붙음 -> 상수도 공유하는 수인데 public 붙여야 하나? 상수가 private이나 default일 수도 있나? 
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	// 추상 메소드 : body{} X, 컴파일 시 알아서 public abstract 붙음
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	
	// default method
	// 컴파일 시 알아서 public 붙음 -> public default ~ -> public과 default가 어떻게 한 번에 붙지???????????
	public default void setMute(boolean mute) { // default 메소드 : 실행 내용까지 작성
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static method
	// 컴파일 시 알아서 public 붙음 -> public static ~ -> private static이 가능한가? 모두 공유하는 static 함수가 public이 아닐 수 있나?
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
