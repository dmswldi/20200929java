package chap14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComparatorEx2 {
	public static void main(String[] args) {
		Random random = new Random();
		List<Member> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(new Member(random.nextInt(100), "java"));
		}
		list.sort((x, y) -> x.getId() - y.getId()); // id순으로 정렬, 파라미터 두 개(Member타입) 받아서 
		
		list.forEach(e -> System.out.println(e));
	}
}

class Member {
	private int id;
	private String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() { return id; }
	public String getName() { return name; }
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
}
