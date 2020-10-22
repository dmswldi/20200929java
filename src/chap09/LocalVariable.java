package chap09;

public class LocalVariable {
	public static void main(String[] args) {// arg도 암묵적 final
		int i = 1; // 암묵적 final
		
		class LocalClass {
			void method1() {
				// 여기서 i 사용하면 i는 final
				// System.out.println(i);
				// i += 1; // 값 변경 X
			}
		}
		
		args = new String[3];
		i += 1; // method1() 내부에서 사용 안 하면 i값 변경 O, 사용하면 X / 왜냐면 내부에서 사용하면 i는 final임
		
		
	}
}
