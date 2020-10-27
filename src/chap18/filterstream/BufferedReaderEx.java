package chap18.filterstream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);// 문자 단위로 읽고
		BufferedReader br = new BufferedReader(reader);// 효율적으로 읽고
		
		System.out.print("입력> ");
		String lineString = br.readLine();
		
		System.out.println("출력: " + lineString);
	}
}
