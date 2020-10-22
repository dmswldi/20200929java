package chap09;

public class Outter {

	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100;
		// localVariable = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariable; // final이라 안에서 쓸 수 O
			}
		}
	}
	
	// 자바 8 이후
	public void method2(int arg) {
		int localVariable = 1; // final 특성 가짐
		// arg = 100;
		// localVariable = 100;
		// 로컬 클래스
		class Inner {
			public void method() {
				int result = arg + localVariable; // 여기에서 사용되면 localVariable, arg가 final이 됨 (수정 불가)
			}
		}
	}
	
}
