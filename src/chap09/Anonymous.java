package chap09;

public class Anonymous {
	// 익명 객체
	Person field = new Person() {
		// 필드 선언
		void work() {
			System.out.println("출급합니다.");
		}
		@Override
		void wake() {
			// super.wake();
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		// 로컬 변수 선언
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
		localVar.wake();
	}
	
	
	void method2(Person person) {
		person.wake();
	}
}
