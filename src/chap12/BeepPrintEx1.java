package chap12;

import java.awt.Toolkit;

public class BeepPrintEx1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {// for문 동시 실행하려면? -> 멀티스레드
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) { e.printStackTrace(); } // 1ms = 1/1000s
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) { e.printStackTrace(); }
		}
	}
}
