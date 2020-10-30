package chap12;

public class ConcurrencyEx1 {
	static int field = 0;// 메인 안에 선언하는 것과 차이? main 스레드의 스택 안에 push vs. method area에 클래스 별로 저장
	
	public static void main(String[] args) {// mutual exclusion X
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1_000_000; i++) {
					field++;
				}
				System.out.println(getName() + " 종료");
				System.out.println(field);
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1_000_000; i++) {
					field++;
				}
				System.out.println(getName() + " 종료");
				System.out.println(field);
			}
		};
		
		t1.start();
		t2.start();
	}
}
