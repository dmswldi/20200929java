package chap15.Map;

import java.util.Map;
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		Map<Member, String> map = new HashMap<>();  
		
		// �߰�
		map.put(new Member(1, "kim"), "excercise");
		map.put(new Member(2, "choi"), "study");
		map.put(new Member(3, "park"), "study");
		map.put(new Member(4, "lee"), "cook");
		map.put(new Member(1, "hong"),"excercise");// ���� �� ��
		map.put(null,"excercise"); // �ǳ�?
		map.put(null,"cook");
		
		System.out.println("nullŰ : " + map.get(null));
		
		// Ű�� ������ �ٸ� ��ü �����ؼ� �ҷ�����, �ҷ������� �� ���� �ʳ�? ���� ȸ���ε� -> equals�� id, name ��� ���� ����
		System.out.println(map.get(new Member(4, "kim")));
		
		System.out.println(map.size());
		
		// �ؽ��ڵ� ������ �� �ؽ��ڵ�, ������ �� -> �ؽ��ڵ� �������ߴ��� ��ü �������� �ƿ� �ٲ��????
		Member m1 = new Member(1, "kim");
		Member m2 = new Member(2, "choi");
		Member m3 = new Member(3, "lee");
		
		System.out.println(m1 + ", " + m2 + ", " + m3); // ��ü ������
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
	}
	
}

class Member {
	private int id;// ������ id
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
