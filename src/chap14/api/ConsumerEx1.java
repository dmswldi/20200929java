package chap14.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx1 {
	public static void main(String[] args) {
		Consumer<Integer> con1 = x -> System.out.println(x * 2); // Consumer interface의 accept() 재정의한 것, 매개변수 타입 Integer
		con1.accept(30);
		
		System.out.println("======list foreach method======");
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(70);
		list.add(77);
		list.add(11);
		list.add(33);
		
		list.forEach(con1);// accept()에 list값 넣기, list 각 값에 대해 accept() 실행
		
		System.out.println("======list foreach method2======");
		list.forEach(x -> System.out.println("items : " + x));
		
	}
}
