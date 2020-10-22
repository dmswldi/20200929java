package chap08;

public class Car {
	// 인터페이스 타입에 구현 객체 대입
	/* Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire BackLefttTire = new HankookTire();
	Tire BackRighttTire = new HankookTire(); */
	Tire[] tires = {
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()	
	};
	
	void run() {
		/* frontLeftTire.roll();
		frontRightTire.roll();
		BackLefttTire.roll();
		BackRighttTire.roll(); */
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
