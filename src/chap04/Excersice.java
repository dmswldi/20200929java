package chap04;

import java.io.IOException;
import java.util.Scanner;

public class Excersice {
	public static void main(String[] args) throws IOException {
		// 5
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				if(4*i+5*j == 60)
					System.out.println("("+ i +", "+ j +")");
			}
		}
		
		// 6
		String txt = "";
		for(int i = 0; i < 5; i++) {
			txt += "*";
			System.out.println(txt);
		}
		
		// input test
/*      int a1 = System.in.read();
        int b1 = System.in.read(); // 자동으로 13 들어감\r
        int c1 = System.in.read(); // 10 \n
        System.out.println(a1 + " " + b1 + " " + c1);*/
		
		// 7
		boolean run = true;
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
/*		int i = sc.nextInt();
		String j = sc.nextLine(); // nextInt()가 남긴 \r\n 자동 읽음
		String k = sc.nextLine();
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);*/
		
		
		while(run) {
			
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			//int input = System.in.read();// 잔고 조회에서, 캐리지라인(13)과 라인피드(10) 처리가 안 됨 -> 이거 쓰지 말고 스캐너 써!!!!!!
			int input = sc.nextInt();
			System.out.println("input: " + input);
			
			if(input == 1) { // 1
				System.out.print("예금액> ");
				balance += sc.nextInt();
			} else if(input == 2) { // 2
				System.out.print("출금액> ");
				balance -= sc.nextInt();
			} else if(input == 3) { // 3
				System.out.print("잔고> " + balance); // input = 13 -> 10이 됨
			} else if(input == 4){ // 4
				run = false;
				System.out.println();
			} 
			System.out.println();
		}
		
		
		System.out.println("프로그램 종료");
		
	}
}
