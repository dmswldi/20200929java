package chap05;

public class Memory {
	public static String appName = "MyCalculator";// static 변수
	
	public static int add(int x, int y) {// static 메소드
		return x+y;
	}
	public int min(int x, int y) {// 일반 메소드
		return x-y;
	}
	
	
	{
		// 객체 생성 전 static 메소드 사용 가능
		// static 변수오ㅑㅏ static 메소드는 객체 생성 이전에 이미 할당되어 있음. 바로 사용 가능
		Memory.add(1, 2);
		// Memory.min(1, 2);
		
		// 객체 생성 후 일반 메소드 사용 가능
		Memory m = new Memory();
		m.min(1, 2);
		
	}
	
}
