package chap12;

public class ThreadClassEx1 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
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
