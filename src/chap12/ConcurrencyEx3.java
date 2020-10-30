package chap12;

public class ConcurrencyEx3 {
	static int field = 0;
	static final Object lock = new Object();// key
	
	public static void inc() {
		synchronized (lock) { // 파라미터 : 객체명, 이 객체 획득하기 전까지 메소드 실행 못 해
			field++;
		}
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
				System.out.println(field);
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
				System.out.println(field);
			}
		};
		
		t1.start();
		t2.start();
	}
}
