package chap16.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class StreamEx8 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
		);
		
//		Map<String, List<String>> groupingMap = list.stream()
		
//		System.out.println("[개발자]");
//		groupingMap.get("개발자").stream().forEach(s -> System.out.print(s + ""));
//		System.out.println("\n[디자이너]");
//		groupingMap.get("디자이너").stream().forEach(s -> System.out.print(s + ""));
		
		
		
		// 변형
		Map<String, List<String>> groupingMap = new HashMap<>();// List에 해당 직업 가진 이름 저장
		
		// 안 보고 해보기
		for(Member member : list) {
			String job = member.getJob();
			String name = member.getName();
			
			if(!groupingMap.containsKey(job)) {// make name list
				List<String> listperJob = new ArrayList<>();
				listperJob.add(name);
				groupingMap.put(job, listperJob);
			} else {// 기존 list 찾아 추가
				// listperJob.add(); ㅜㅜ
				groupingMap.get(job).add(name);
			}
			
		}
		//
		
		
		List<String> developers = groupingMap.get("개발자");
		List<String> designers = groupingMap.get("디자이너");
		
		System.out.print("[개발자]");
		for (String name : developers) {
			System.out.print(" " + name);
		}
		System.out.println();
		
		System.out.print("[디자이너]");
		for (String name : designers) {
			System.out.print(" " + name);
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
