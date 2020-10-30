package chap14.api;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorEx1 {// operator는 사실 function이에요
	public static void main(String[] args) {
		UnaryOperator<Integer> op1 = x -> x * x;
		int r = op1.apply(3);
		System.out.println(r);
		
		BinaryOperator<Integer> op2 = (x, y) -> x + y;// 같은 T 타입
		System.out.println(op2.apply(10, 20));
	}
	
}
