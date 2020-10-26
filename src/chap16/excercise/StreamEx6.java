package chap16.excercise;

import java.util.Arrays;
import java.util.List;

public class StreamEx6 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동", 30),
			new Member("신용권", 40),
			new Member("김자바", 26)
		);
		
//		double avg = list.stream()
		
		// 변형
		double avg = 0.0;
		// advanced for
		for(Member member : list) {
			avg += member.getAge();
		}
		// for
		/* for(int i = 0; i < list.size(); i++) {
			avg += list.get(i).getAge();
		}*/
		
		System.out.println("평균 나이: " + avg/list.size());
	}
	
	
	static class Member {
		private String name;
		private int age;
		
		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public String getName() { return name; }
		public int getAge() { return age; }
	}
	
	
}