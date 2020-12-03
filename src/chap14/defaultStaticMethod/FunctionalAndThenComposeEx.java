package chap14.defaultStaticMethod;

import java.util.function.Function;

public class FunctionalAndThenComposeEx {
	public static void main(String[] args) {
		Function<Member, Address> functionA;// Member 받아서 Address 리턴
		Function<Address, String> functionB;// Address 받아서 String 리턴
		Function<Member, String> functionAB;// -> Member 받아서 String 리턴
		String city;
		
		functionA = m -> m.getAddress();
		functionB = a -> a.getCity();
		
		functionAB = functionA.andThen(functionB);// A -> B
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);
		
		functionAB = functionB.compose(functionA);// A -> B
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);
	}
}
