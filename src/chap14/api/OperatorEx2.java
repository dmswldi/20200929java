package chap14.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class OperatorEx2 {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();// 부모 메소드 사용, 재정의된 건 자식 메소드 사용, 자식만 가지고 있는 메소드xx
		// 자동 타입 변환 이후 부모 필메만 접근 가능인데...??? P309 replaceall은 arrayList 메소드
		Supplier<Double> sup = () -> Math.random();
		
		while(list.size() < 10) {
			list.add(sup.get());
		}
		
		System.out.println("----- 값 확인");
		list.forEach(e -> System.out.println(e));
		
		list.replaceAll(x -> x * 2);
		System.out.println("----- 2배 값 확인");
		list.forEach(e -> System.out.println(e));
	}
}
