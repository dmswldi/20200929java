package chap14.methodref;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesEx {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;// 생성자 참조, 단순 객체 생성
		Member member1 = function1.apply("angel");// 생성자 매개값 전달
		System.out.println(member1.getId() + ", " + member1.getName());
		
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("김천사", "angel");// 매개변수 2개인 생성자 호출
		System.out.println(member1.getId() + ", " + member2.getName());
		
	}
}

class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() 실행");
	}
	public Member(String id) {
		System.out.println("Member(String id) 실행");
		this.id = id;
	}
	public Member(String name, String id) {
		System.out.println("Member(String name, String id) 실행");
		this.name = name;
		this.id = id;
	}
	
	public String getName() {return name;}
	public String getId() { return id; }
}
