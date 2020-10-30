package chap12;

public class RunnableInterfaceEx1 {// Thread를 상속하거나 < Runnable을 구현해서 멀티 스레드 구현, 클래스는 상속 1번 밖에 못 받으니까
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable1());
		Thread t2 = new Thread(new Runnable2());
		
		t1.start();
		t2.start();
		
	}
}

class Runnable1 implements Runnable {// 스레드로 실행하고 싶은 class instance에 Runnable 구현
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

class Runnable2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println((char) ('a'+1));
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}