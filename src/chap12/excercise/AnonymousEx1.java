package chap12.excercise;

public class AnonymousEx1 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {// 익명 클래스 객체로 스레드 생성
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println(i);
					try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
				}
			}
		};
		
		Thread t2 = new Thread(new Runnable() {// 몸통이 interface implements한 class 역할
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println((char) ('a'+i));
					try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); }
				}
			}
		});
		
		// 더 간략히: 람다식
		Thread t3 = new Thread(()-> {// 메소드명, 파라미터명 생략해도 ㅇ, 명확하니까, 여기 들어가는 인터페이스가 Runnable이라는 걸 JVM이 유추
			for(int i = 0; i < 5; i++){
				System.out.println((char) ('Z'-i));
				try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); }
			}
		
		});
		
		t1.start();
		t2.start();
		t3.start();
	}
}

