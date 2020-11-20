package chap14.lambda;

public class UsingLocalVariableEx {
	public static void main(String[] args) {
		UsingLocalVariable ulv = new UsingLocalVariable();
		ulv.method(20);
	}
	
	
}

class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
//		arg = 31;// final이라 수정 불가
//		localVar = 41;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);// enclosing scope에 정의되면 final
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
	
	interface MyFunctionalInterface {
		public void method();
	}
}


