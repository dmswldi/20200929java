package chap02.variable;

public class VariableScope {
	public static void main(String[] args) {
		int a = 3;
		if (true){
			int b = 5;
			System.out.println(a);
			System.out.println(b);
		}
		
		System.out.println(a);
		//System.out.println(b);
	}
}
