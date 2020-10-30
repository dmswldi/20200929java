package chap12;

public class ConcurrentcyEx2 {
	static int field = 0;
	
	public synchronized static void inc() {// 메소드 동시 실행 금지: synchronized (동기화)-> 속도 느려짐
		field++;
	}
	public static void main(String[] args) {// mutual exclusion O
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1_000_000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName() + " 종료");
				System.out.println(field); // 얘는 백만 혹은 그 이상
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1_000_000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName() + " 종료");
				System.out.println(field);// 결국은 이백만
			}
		};
		
		t1.start();
		t2.start();
	}
}
