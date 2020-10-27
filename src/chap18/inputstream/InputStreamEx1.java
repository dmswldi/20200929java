package chap18.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/inputstream/InputStreamEx1.java";
		InputStream is = new FileInputStream(path);
		
		int cnt = 0;
		int r = 0;
		// 파일 1바이트씩 읽다가 더 이상 읽을 내용 없으면 -1 출력 // 출력: '파' 한 글자를 1바이트로 못 읽음!
		while((r = is.read()) != -1) { // 다음 1byte 읽고 앞에 3byte는 0 채워서 int(4byte)로 출력
			System.out.print((char)r);
			cnt++;
		}
		System.out.println(cnt); // 파일 바이트 수 출력
		
		is.close();
	}
}
