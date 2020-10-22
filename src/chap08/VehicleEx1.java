package chap08;

public class VehicleEx1 {
	public static void main(String[] args) {
		// 자동 타입 변환
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); // 인터페이스에 선언된 메소드만 사용 가능
		
		// casting
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
	}
}
