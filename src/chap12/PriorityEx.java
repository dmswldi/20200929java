package chap12;

public class PriorityEx {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if(i != 10) thread.setPriority(Thread.MIN_PRIORITY);
			else thread.setPriority(thread.MAX_PRIORITY);
			
			thread.start();
		}
		
	}
}

class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20_0000_000; i++) {
			
		}
		System.out.println(getName());
	}
}
