package chap14.methodref;

import java.util.Random;
import java.util.function.Supplier;

public class MethodRefEx1 {
	public static void main(String[] args) {
		// 간단하게 random() 메소드 호출하고 끝나는 경우 있음 -> 메소드 참조 사용 가능
		Supplier<Double> random = () -> Math.random();
		Supplier<Double> ran2 = Math::random; // class::method (좌우항 리턴타입 같다면.)
		
		Random rand = new Random();
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextInt());
		
		Supplier<Integer> nextInt = () -> rand.nextInt();
		Supplier<Integer> nextInt2 = rand::nextInt;// Random::nextInt는 아니네
		Supplier<Integer> nextInt3 = () -> new Random().nextInt();
		
		Supplier<Car> nextCar = () -> new Car();// 새로운 카 객체 리턴
		Supplier<Car> nextCar2 = Car::new;
		System.out.println(nextCar2.get().getSpeed());
	}
}

class Car {
	private int speed;
	
	public Car() {
		this.speed = 0;
	}
	public Car(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() { return speed; }
}
