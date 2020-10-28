package chap13.excercise;

public class UtilEx {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동"); // 35 나오게
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순"); // null
		System.out.println(childAge);
		
		// Pair 상속하지 않는 OtherPair
		OtherPair<String,Integer> otherPair = new OtherPair<>("홍삼원", 20);
		/*int otherAge = Util.getValue(otherPair, "홍삼원");
		System.out.println(otherAge);*/
	}
}

