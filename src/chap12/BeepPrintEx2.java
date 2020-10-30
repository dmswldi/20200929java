package chap12;

import java.awt.Toolkit;

public class BeepPrintEx2 {// 메인 스레드와 BeepThread 동시 실행
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) { e.printStackTrace(); }
		}
	}
}

class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i ++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) { e.printStackTrace(); }
		}
	}
}