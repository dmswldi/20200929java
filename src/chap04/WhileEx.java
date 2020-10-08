package chap04;

import java.io.IOException;
import java.util.Scanner;

public class WhileEx {
	public static void main(String[] args) throws IOException {
		// while
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		/*while(run) {
			if(keyCode != 13 && keyCode != 10) { // 캐리지리턴(13), 라인피드(10)
				System.out.println("------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("------------");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) { // 1
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if(keyCode == 50) { // 2
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 51) { // 3
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");*/
		
		
		// do-while
		/*System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();// 콘솔에 입력된 문자열 한 번에 읽기
			System.out.println(inputString);
		} while (! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");*/
		
		
		// break while
		/*while(true) {
			int num = (int)(Math.random()*6) + 1; // 1~6
			System.out.println(num);
			if(num == 6) break;
		}
		System.out.println("프로그램 종료");*/
		
		
		
		// 바깥쪽 반복문 종료: label 붙여서 break
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') break Outter;
			}
		}
		
		System.out.println("프로그램 종료");
		
		
		// continue -> 건너 띄기, 실행 X
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) continue; // 홀수일 경우 실행 X
			System.out.println(i);
		}
		
		
		
		System.exit(0); // ERROR: JDWP Unable to get JNI 1.2 environment ???
	}
		
}
