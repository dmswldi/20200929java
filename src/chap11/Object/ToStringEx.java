package chap11.Object;

import java.util.Date;

public class ToStringEx {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.setFields(27, "은은", "1234");
		System.out.println(o1.toString()); // @ 뒤는 참조값 = 16진수 해시코드
		System.out.println(o1);
		
		MyClass o2 = new MyClass();
		System.out.println(o2.toString());
		
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		
		Date obj2 = new Date(); // 재정의, 날짜와 시간 정보 리턴
		System.out.println(obj2.toString());
		
		String str = "Hi Hello"; // 재정의 , 문자열 리턴
		System.out.println(str.toString());
		
		
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		System.out.println(myPhone.toString());
		System.out.println(myPhone); // .toString() 자동 호출
	}
}

class MyClass {
	private int age;
	private String name;
	private String password;
	
	public void setFields(int age, String name, String password) {
		this.age = age;
		this.name = name;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return age + "살, " + name + ", 비밀번호: " + password;
	}
}

class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return company + ", " + os;
	}
	
	
}
