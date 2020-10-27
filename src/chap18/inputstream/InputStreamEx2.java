package chap18.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx2 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/inputstream/InputStreamEx2.java";
		InputStream is = new FileInputStream(path);
		
		byte[] data = new byte[10];
		
		int readCnt = 0; 
		int loopCnt = 0;
		
		while((readCnt = is.read(data)) != -1) {// 최대 파라미터로 받은 배열 길이만큼 읽음
			loopCnt++;
		}
		
		System.out.println(loopCnt);
		
		is.close();
	}
}
