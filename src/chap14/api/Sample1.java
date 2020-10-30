package chap14.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Sample1 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("java");
		names.add("html");
		names.add("css");
		names.add("jsp");
		names.add("servlet");
		
//		Consumer<String> o1 = (s) -> System.out.println(s);// Consumer ???
//		names.forEach(o1);// ArrayList의 foreach(Consumer action)
		names.forEach(s -> System.out.println(s));
	}
}
