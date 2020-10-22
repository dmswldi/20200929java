package chap07.polymorphism.field;

public class Car {
	/* Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire BackLeftTire = new Tire("뒤왼쪽", 3);
	Tire BackRightTire = new Tire("뒤오른쪽", 4);*/
	Tire[] tires = {
		new Tire("앞왼쪽", 6),
		new Tire("앞오른쪽", 2),
		new Tire("뒤왼쪽", 3),
		new Tire("뒤오른쪽", 4)
	};
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		
		/* if(!frontLeftTire.roll()) { stop(); return 1; }
		if(!frontRightTire.roll()) { stop(); return 2; }
		if(!BackLeftTire.roll()) { stop(); return 3; }
		if(!BackRightTire.roll()) { stop(); return 4; } */
		for(int i = 0; i < tires.length; i++) {
			if( !tires[i].roll() ) { stop(); return i+1; }
		}
		
		return 0;
	}
	
	// 펑크 시
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
