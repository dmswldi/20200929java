package chap18.console;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력> ");
		System.out.println(sc.nextLine() + "\n");
		
		System.out.print("정수 입력> ");
		System.out.println(sc.nextInt() + "\n");
		
		System.out.print("실수 입력> ");
		System.out.println(sc.nextDouble() + "\n");
	}
}
