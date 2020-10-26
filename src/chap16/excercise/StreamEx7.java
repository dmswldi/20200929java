package chap16.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx7 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동", "개발자"),
			new Member("김나리", "디자이너"),
			new Member("신용권", "개발자")
		);
		
//		List<Member> developers = list.stream()
//			developers.stream().forEach(m -> System.out.println(m.getName()););
		
		// 변형
		List<Member> developers = new ArrayList<>();
		for(Member member : list) {
			if(member.getJob().equals("개발자")) {
				developers.add(member);
			}
		}
		
		for (Member member : developers) {
			System.out.println(member.getName());
		}
	}
	
	
	static class Member {
		private String name;
		private String job;
		
		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}
		
		public String getName() { return name; }
		public String getJob() { return job; }
	}
	
}
