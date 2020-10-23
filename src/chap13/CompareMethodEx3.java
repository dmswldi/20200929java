package chap13;

public class CompareMethodEx3 {
	public static void main(String[] args) {
		Pair3<Integer, String> p1 = new Pair3<Integer, String>(1, "사과");
		Pair3<Integer, String> p2 = new Pair3<Integer, String>(1, "사과");
		boolean result1 = Util3.<Integer, String>compare(p1, p2); // == Util3.compare(p1, p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		Pair3<String, String> p3 = new Pair3<String,String>("user1", "홍길동");
		Pair3<String, String> p4 = new Pair3<String,String>("user2", "홍길동");
		boolean result2 = Util3.compare(p3, p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
	}
}
