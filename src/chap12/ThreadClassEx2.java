package chap12;

public class ThreadClassEx2 {// 메인까지 3개의 thread, 스레드 돌려가며 실행
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		// start() 하면 JVM이 적절하게 run() 실행시켜줌
		t1.start();
		t2.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println((char) ('Z'-i));
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println((char) ('a'+i));
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}