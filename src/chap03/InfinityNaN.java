package chap03;

public class InfinityNaN {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x/y;
		double a = x%y; // NaN
		System.out.println(a);
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(Double.isInfinite(a));
		System.out.println(Double.isNaN(a));
		
		System.out.println(z+2);
		
		// 실수는 반드시 NaN 검사!
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) { // NaN 처리
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
