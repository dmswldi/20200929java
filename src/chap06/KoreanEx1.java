package chap06;

public class KoreanEx1 {
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "930525-0654321");
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);
		
		// Korean k3 = new Korean();
		
		// k1.nation = "usa"; -> final 값 변경 불가
 		// k1.ssn = "654321-7654321";
		k1.name = "을지문덕";
	}
}
