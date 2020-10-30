package chap12;

public class ThreadNameEx {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}
}

class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}
}

class ThreadB extends Thread {
	public ThreadB() {
		setName("ThreadB");
	}
}