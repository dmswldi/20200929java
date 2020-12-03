package chap14.defaultStaticMethod;

import java.util.function.Consumer;

public class ConsumerAndThenEx {
	public static void main(String[] args) {
		Consumer<Member> consumerA = m -> System.out.println("consumerA: " + m.getName());
		
		Consumer<Member> consumerB = m -> System.out.println("consumerB: " + m.getId());
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);// A -> B, Consumer는 리턴값 X -> 인터페이스 호출 순서
		consumerAB.accept(new Member("홍길동", "hong", null));
	}
}

class Member {
	private String name;
	private String id;
	private Address address;
	
	public Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() { return name; }
	public String getId() { return id; }
	public Address getAddress() { return address; }
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && this.id != null && obj instanceof Member) {
			Member member = (Member) obj;
			return member.id == this.id;
		}
		return false;
	}
}

class Address {
	private String country;
	private String city;
	
	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}

	public String getCountry() { return country; }
	public String getCity() { return city; }
}