package chap06;

public class CarEx1 {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		// System.out.println("car2.color : " + car2.color);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
		System.out.println("\n");

		Car c2 = new Car();
		System.out.println(c2.maxSpeed); // class는 초기값 없어도 0, null, false로 초기화 되어 있음
		
		
		System.out.println("================");
		// 추가 : 클래스 외부에서 메소드 호출
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
		
		
		System.out.println("================");
		// 추추가 : 인스턴스 멤버와 this
		Car mCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		mCar.run();
		yourCar.run();
		
		
		System.out.println("================");
		Car car5 = new Car();
		
		car5.setSpeed(-50);
		System.out.println("현재 속도: " + car5.getSpeed());
		
		car5.setSpeed(60);
		System.out.println("현재 속도: " + car5.getSpeed());
		
		if(!car5.isStop()) {
			car5.setStop(true);
		}
		
		System.out.println("현재 속도: " + car5.getSpeed());
		
	}
}
