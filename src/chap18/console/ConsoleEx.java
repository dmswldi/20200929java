package chap18.console;

import java.io.Console;

public class ConsoleEx {
	public static void main(String[] args) {
		Console console = System.console();// 항상 null 리턴 -> cmd에서 실행! (ANSI로 인코딩)
		
		System.out.print("아이디: ");
		String id = console.readLine();
		
		System.out.print("패스워드: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println(id + ", " + strPassword);
	}
}
