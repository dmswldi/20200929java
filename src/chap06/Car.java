package chap06;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){ // 그래도 얘는 비우네
		
	}
	
	Car(String model){ // 매개변수와 필드명 통일, this로 구분 
		// this.model = model;
		this(model, "은색", 250);
	}
	
	Car(String model, String color){
		// this.model = model;
		// this.color = color;
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){ // 생성자 오버로딩 줄이기 -> 다른 생성자에서 얘를 호출!
		// 공통 실행 코드 (매개변수가 최다인 생성자)
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	// 추가 : 클래스 외부에서 메소드 호출
	private int speed;
	private boolean stop; 
	
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {// this : 인스턴스 멤버인 필드임을 명시
			this.speed = speed;
		}
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			// speed = i;
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속: " + speed + "km/h)");
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}

