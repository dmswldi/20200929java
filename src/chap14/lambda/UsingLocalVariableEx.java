package chap14.lambda;

public class UsingLocalVariableEx {
	public static void main(String[] args) {
		UsingLocalVariable ulv = new UsingLocalVariable();
		ulv.method(20);
	}
	
	
}

interface MyFunctionalInterface {
	public void method();
}

class UsingLocalVariable {
	void method(int arg) {// arg는 final (??0
		int localVar = 40;
		
//		arg = 31;
//		localVar = 41;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);// enclosing scope에 정의되면 final
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
}


