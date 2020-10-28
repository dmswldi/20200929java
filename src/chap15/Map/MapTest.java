package chap15.Map;

import java.util.Map;
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		Map<Member, String> map = new HashMap<>();  
		
		// 추가
		map.put(new Member(1, "kim"), "excercise");
		map.put(new Member(2, "choi"), "study");
		map.put(new Member(3, "park"), "study");
		map.put(new Member(4, "lee"), "cook");
		map.put(new Member(1, "hong"),"excercise");// 저장 안 됨
		map.put(null,"excercise"); // 되네?
		map.put(null,"cook");
		
		System.out.println("null키 : " + map.get(null));
		
		// 키값 동일한 다른 객체 정의해서 불러오기, 불러와지면 안 되지 않나? 없는 회원인데 -> equals를 id, name 모두 같게 설정
		System.out.println(map.get(new Member(4, "kim")));
		
		System.out.println(map.size());
		
		// 해시코드 재정의 후 해시코드, 번지수 비교 -> 해시코드 재정의했더니 객체 번지수가 아예 바뀌네????
		Member m1 = new Member(1, "kim");
		Member m2 = new Member(2, "choi");
		Member m3 = new Member(3, "lee");
		
		System.out.println(m1 + ", " + m2 + ", " + m3); // 객체 번지수
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
	}
	
}

class Member {
	private int id;// 고유한 id
	private String name;
	
	Member(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member){
			Member member = (Member) obj;
			return member.id == id && member.name == name;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
}
