package chap07;

public class PhoneEx1 {
	public static void main(String[] args) {
		// Phone phone = new Phone("홍길동"); // 추상 클래스는 직접 객체 생성 X
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSerach();
		smartPhone.turnOff();
	}
}
