package chap14.lambda;

public class MyFunctionalInterfaceEx1 {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method call1";
			System.out.println("method call2");
		};
		
		fi.method();
		
		fi = () -> { System.out.println("method call3"); };
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
		
	}
	
	@FunctionalInterface
	private interface MyFunctionalInterface {
		public void method();
	}
}


