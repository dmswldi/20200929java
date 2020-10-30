package chap14.api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {
	public static void main(String[] args) {
		Consumer<String> consumer =t -> System.out.println(t + "8"); 
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("java", "8");
		
		DoubleConsumer doubleCounsumer = d -> System.out.println("java" + d); 
		doubleCounsumer.accept(8.0);// accept() 매개변수가 double 타입
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println("Java" + i);
		objIntConsumer.accept("Java", 8);// <T, int> -> T 타입만 결정해주기
	}
}
