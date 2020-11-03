package chap18.console;

import java.io.InputStream;

public class SystemInEx1 {
	public static void main(String[] args) throws Exception {
		System.out.println("== 메뉴 ==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료하기");
		System.out.print("메뉴를 선택하세요: ");
		
		InputStream is = System.in;
		char inputChar = (char) is.read();// 아스키 코드 읽고 문자로 리턴, 캐스팅 안 하면 바이트수+엔터를 int로 반환
		// char는 2byte but 아스키코드(영어 등)는 1byte
		// read()로 1byte 읽어서 아스키코드를 char로 캐스팅
		switch(inputChar){
			case '1':
				System.out.println("예금 조회를 선택하셨습니다.");
				break;
			case '2':
				System.out.println("예금 출금을 선택하셨습니다.");
				break;
			case '3':
				System.out.println("예금 입금을 선택하셨습니다.");
				break;
			case '4':
				System.out.println("종료하기를 선택하셨습니다.");
				break;
		}
	}
}

