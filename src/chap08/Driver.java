package chap08;

public class Driver {
	public void drive(Vehicle vehicle) {
		// casting 전 istanceof로 객체 확인
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
