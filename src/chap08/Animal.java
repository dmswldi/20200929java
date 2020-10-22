package chap08;

abstract class KindaCat {
	abstract void cry();
}

abstract class KindaDog {
	abstract void bark();
}

interface Pet {
	public abstract void sit();
}

class Cat extends KindaCat implements Pet {
	@Override
	void cry() {
		System.out.println("야옹~");
	}	
	@Override
	public void sit() {
		System.out.println("고양이 앉음");
	}
}

class Tiger extends KindaCat {
	@Override
	void cry() {
		System.out.println("어흥!!!!");
	}
}


class Malamute extends KindaDog implements Pet {
	@Override
	void bark() {
		System.out.println("왈왈!!!~~");
	}
	@Override
	public void sit() {
		System.out.println("말라뮤트 앉음");
	}
}

class Wolf extends KindaDog {
	@Override
	void bark() {
		System.out.println("워우~~~~~~");
	}
}


public class Animal {
	public static void main(String[] args) {
		KindaCat c1 = new Cat();
		KindaCat c2 = new Tiger();
		
		KindaDog d1 = new Malamute();
		KindaDog d2 = new Wolf();
		
		c1.cry();
		c2.cry();
		
		d1.bark();
		d2.bark();
		
		Pet p1 = new Cat();
		Pet p2 = new Malamute();
		
		p1.sit();
		p2.sit();
		
		
		if(p1 instanceof Cat) {
			Cat cat1 = (Cat) p1;
			System.out.println("O");
		}
		System.out.println(p1 instanceof KindaCat);
		System.out.println(p1 instanceof Pet);
		
		if(p2 instanceof Malamute) {
			Malamute mal1 = (Malamute) p2;
			System.out.println("O");
		}
		System.out.println(p2 instanceof KindaDog);
		System.out.println(p2 instanceof Pet);
		
	
	}
}