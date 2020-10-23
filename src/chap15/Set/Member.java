package chap15.Set;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) { // equals != hashCode
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} 
		return false;
	}
	
	@Override
	public int hashCode() { // name과 age 같으면 같은 hashCode 리턴.
		return name.hashCode() + age; // String이 같으면 hashCode가 같음!!
	}
}
