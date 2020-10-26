package chap15.LIFOFIFO;

import java.util.Stack;

public class StackEx {// List<E> 구현
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		
		System.out.println(coinBox.get(0).getValue()); // List<E>의 메소드 사용 가능
//		coinBox.add(new Coin(2)); // 되는군
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue());// LIFO
		}
	}
}
