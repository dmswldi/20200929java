package chap11.Object;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashCodeEx {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1); // 16진법, 객체의 메모리 번지
		System.out.println(o2);
		System.out.println(o1.hashCode()); // 10진법
		System.out.println(o2.hashCode());
		
		System.out.println("---------");
		// 재정의된 String.hashCode()
		String s1 = "java";
		String s2 = new String("java");
		System.out.println(s1 == s2); // 다른 객체
		System.out.println(s1.hashCode()); // 문자열이 같으면 해시코드가 같음, 다른 인스턴스지만 같은 서랍에 넣어둠
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2)); // 내부 값 비교
		
		System.out.println("---------Book");
		Book b1 = new Book(963);
		Book b2 = new Book(963);
		System.out.println(b1 == b2); // 다른 객체, 객체 번지 비교
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2)); // 재정의 안 하면 false, 하면 true
		// hashCode() 재정의 후 equals() 재정의 해야 함
		// hashCode() : 같은 객체인지 확인, equals() : 같은 내용인지 확인
		
		// self-text
		Set<Book> shelf = new HashSet<>();  
		shelf.add(new Book(200));
		System.out.println(shelf.contains(new Book(200))); // hashCode 재정의 안 하면 false
		
		System.out.println("---------");
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
		
		
		
		System.out.println("---------");
		HashMap<Key, String> hashMap = new HashMap<Key,String>();// 객체와 String
		Key k1 = new Key(1);
		hashMap.put(k1, "홍길동");
		
		Key k2 = new Key(1);
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k1.equals(k2)); // 넘버 같으면 equals
		System.out.println(k1.hashCode()); // 객체 번지 리턴 -> 재정의 하면 넘버 리턴
		System.out.println(k2.hashCode());
		String value = hashMap.get(k2); // null
		System.out.println(value);
		// hashCode() 재정의X -> true, 해시코드 다름, null
		// hashCode() 재정의O -> true, 1, 1, 홍길동
	}
}

class Book {
	private int barCode;
	
	public Book(int barCode) {
		this.barCode = barCode;
	}
	
	
	@Override
	public int hashCode() {
		return barCode; // 같은 바코드를 넣으면 해시코드가 같게끔-> 같은 객체로 인식
	}

	@Override
	public boolean equals(Object obj) { // 바코드가 같으면 equals
		Book o = (Book) obj; // 불안정 코드, 캐스팅 문제
		return this.barCode == o.barCode;
	}
	// -> 원래는 다른 객체니까 해시코드가 달라서 (바코드가 같아도) equals가 false
	// -> 해시코드, equals 재정의로 바코드가 같으면 같게 나오게
	
	// self-study
	public int getBarcode() { return this.barCode; }
	public void setBarcode(int barCode) { barCode = this.barCode; }
	
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + barCode;
		return result; // 바코드에 따라 달라지는 해시코드
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 같은 객체면 true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // 같은 클래스(Book) 아니면 false
			return false;
		Book other = (Book) obj;
		if (barCode != other.barCode)
			return false;
		return true;
	}*/

	
}

class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) { // id의 값(String)이 같으면 equals
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode(); // String의 hashCode는 같은 문자열일 경우 동일 해시코드 리턴.
	}
}

class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) { // number 같으면 equals
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	// 추가: hashMap에서 해시코드값을 비교. 해시코드가 같으면 같은 Key 가리킴.
	// 이걸 안 하면 같은 number를 가져도 다른 객체여서 not equals.
	@Override
	public int hashCode() {
		return number;
	}
}
