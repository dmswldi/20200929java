package chap14.defaultStaticMethod;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByEx {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		// Comparator<T> interface : compare(T1, T2) 재정의 
		binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
		
		binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
		
		
		binaryOperator = BinaryOperator.maxBy((f1, f2) -> f1.name.compareTo(f2.name));// 포도가 나중 사전순서
		fruit = binaryOperator.apply(new Fruit("포도", 5000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
	}
}

class Fruit {
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
