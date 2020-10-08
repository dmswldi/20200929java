package chap03;

public class Excersice {
	public static void main(String[] args) {
		// 5번
		int value = 356;
		System.out.println(value/100*100);
		System.out.println(value*100/100);
		System.out.println(value-(value%300));
		
		// 6번 - int끼리 계산하면 결과도 int!!!!!!!!
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		// double area = (lengthTop+lengthBottom)*height/2.0; // int/int = int라서 low accuracy  -> 2.0으로 나누거나 0.5 곱하거나 double로 casting
		double area = (double)(lengthTop+lengthBottom)*height/2;
		System.out.println(area);
		
		// 8번
		double x = 5.0;
		double y = 0.0;
		double z = x % y;
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없음");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
	}
}
