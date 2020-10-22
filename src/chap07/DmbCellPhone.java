package chap07;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		// super(); // 자식 생성자 첫 줄에 자동 생성 -> 부모의 기본 생성자 호출-부모 객체 만듦
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
