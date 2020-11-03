package chap18.console;

import java.io.OutputStream;
import java.io.PrintStream;

public class SystemOutEx {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;// 콘솔 출력
		
		for(byte b = 48; b < 58; b++) {// 0-9
			os.write(b);
		}
		os.write(10); // line feed : 커서를 아래 행으로, carriage return : 좌측 끝으로
		
		for(byte b = 97; b < 123; b++) {// a-z
			os.write(b);
		}
		os.write(10);
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.write(10);
		
		PrintStream ps = System.out; // 원래 타입
		String hangul2 = "안녕하세요";
		ps.print(hangul2);
	}
}
