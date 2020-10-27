//한글
package chap18.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class ReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/reader/ReaderEx1.java";
		Reader reader = new FileReader(path);// fr = new fr 이랑 r = new fr 차이 : 필메를 누구걸 쓸 거냐
		
		// 문자 단위로 읽기
		int ch = reader.read(); // char 2byte, int 4byte -> 2byte만 채워서 리턴
		System.out.println(ch);// package의 p만 읽음
		System.out.println((char)ch);
		
		reader.read();
		ch = reader.read();
		System.out.println((char) ch);// 한글 2bytes
		
		reader.close();
		
		
		// +
		InputStream is = new FileInputStream(path);
		
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read()); // 한글 2byte인데 1byte로는 못 읽어서 깨짐
	}
}
