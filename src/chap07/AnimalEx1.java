package chap07;

public class AnimalEx1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		// 자동 타입 변환 -> 필드의 다형성
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		// 자동 타입 변환 -> 매개 변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
