package chap12.excercise;

public class MainThreadEx {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();// 공유 객체
		
		User1 user1 = new User1();// 스레드
		user1.setCalculator(calculator);
		user1.start();// JVM이 스레드의 run() 실행
		
		User2 user2 = new User2();// 스레드
		user2.setCalculator(calculator);
		user2.start();
	}
}

class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {// public synchronized: 동시 접근 불가
		synchronized (this) {// this는 호출한 객체
			this.memory = memory;
		
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}

class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}

class User2 extends Thread {
private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
