package chap06;

public class Korean {
	final String nation = "대한민국";
	String name;
	final String ssn;
	
	public Korean(String name, String ssn) {
		this.name = name; // this: 객체 자신 ( 생성자에서 사용 )
		this.ssn = ssn;
	}
}
 