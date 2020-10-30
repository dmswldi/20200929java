package chap12.excercise;

public class ThreadEx {
	public static void main(String[] args) {// Thread implements Runnable
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());// Thread() : Allocates a new Thread object.
		thread2.start();
	}
}

class MovieThread extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MusicRunnable implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}