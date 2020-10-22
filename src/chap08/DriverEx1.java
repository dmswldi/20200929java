package chap08;

public class DriverEx1 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 매개 변수의 다형성
		driver.drive(bus);
		driver.drive(taxi);
	}
}
