package chap07;

public class Car {
	public int speed;
	
	public void speedUp() { speed += 1; }
	
	// final method
	public final void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
