package chap14.defaultStaticMethod;

import java.util.function.Predicate;

public class PredicateIsEqualEx {
	public static void main(String[] args) {
		// Predicate's static method : isEqual()
		Predicate<String> predicate;
		
		// : Objects.equals(resourceObject, targetObject) 실행
		predicate = Predicate.isEqual(null);// targetObject, 얘랑 비교할 거야
		System.out.println("null, null: " + predicate.test(null));// sourceObject, 비교 대상
		// -> Objects.equals(null, null) 실행
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("null, Java8: " + predicate.test(null));
		// -> Objects.equals(null, "Java8") 실행
		
		predicate = Predicate.isEqual(null);
		System.out.println("Java8, null: " + predicate.test("Java8"));
		// -> Objects.equals("Java8", null) 실행
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, null: " + predicate.test("Java8"));
		// -> Objects.equals("Java8", "Java8") 실행
		
		
		// id 같으면 같은 Member로 인식하게 Member.equals() 재정의
		Predicate<Member> predicate2;
		
		predicate2 = Predicate.isEqual(new Member("홍길동", "hong", null));
		System.out.println("Member1, Member2: " + predicate2.test(new Member("고길동", "hong", null)));
		// -> Objects.equals(Member1, Member2) 실행
	}
}
