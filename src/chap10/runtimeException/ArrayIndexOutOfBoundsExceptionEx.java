package chap10.runtimeException;

public class ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String[] args) {
		/* String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("arg[0]: " + data1);
		System.out.println("arg[1]: " + data2); */
		
		if(args.length == 2) { // 배열값 읽기 전 배열 길이 조사
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("arg[0]: " + data1);
			System.out.println("arg[1]: " + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.print("java  ArrayIndexOutOfBoundsException  ");
			System.out.print("값1  값2");
		}
	}
}
