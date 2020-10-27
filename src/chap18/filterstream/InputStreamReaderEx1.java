//한글
package chap18.filterstream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/filterstream/InputStreamReaderEx1.java";
		InputStream is = new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(is); // inputStream 읽기 -> 한글 안 깨짐
		
		
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());// is.read()는 '한'의 일부 글자만 바이트로 읽음
		
		
		is.close();
	}
}
