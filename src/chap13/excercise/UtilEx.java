package chap13.excercise;

public class UtilEx {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("ȫ�浿", 35);
		Integer age = Util.getValue(pair, "ȫ�浿"); // 35 ������
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("ȫ���", 20);
		Integer childAge = Util.getValue(childPair, "ȫ���"); // null
		System.out.println(childAge);
		
		// Pair ������� �ʴ� OtherPair
		OtherPair<String,Integer> otherPair = new OtherPair<>("ȫ���", 20);
		/*int otherAge = Util.getValue(otherPair, "ȫ���");
		System.out.println(otherAge);*/
	}
}
