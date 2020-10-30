package chap12;

public class Priority {
	public static void main(String[] args) {
		Thread[] threads = new Thread[20];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread() {
				@Override
				public void run() {
					for (int j = 0; j < 2_0_0000_0000; j++) {// 더하기, 비교 연산 : 왕빠르다
						
					}
					System.out.println(getName() + "완료");
				}
			};
			if(i > 10) threads[i].setPriority(10);// 확률일 뿐!
			else threads[i].setPriority(1);
		}
		
		
		for(Thread t : threads) {// enhanced for
			t.start();
		}
	}
}
