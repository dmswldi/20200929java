package chap18.reader;

import java.io.FileReader;

public class FileReaderEx {// 주석 하이: 주석 없애고 확인해보기
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(
				"src/chap18/reader/FileReaderEx.java");
		
		int readCharNo;
		int sum = 0;
		char[] cbuf = new char[10];// 한글도 1char
		while((readCharNo = fr.read(cbuf)) != -1) {// char 10개 받아서 읽음
			String data = new String(cbuf, 0, readCharNo);// 배열, 해당 배열의 시작 위치, 길이
			System.out.print(readCharNo + ":");
			System.out.println(data);
			sum += readCharNo; // 한글 포함 글자 하나당 +1
		}
		
		fr.close();
		
		System.out.println(sum);
		// 한글은 3byte씩 추가되는데, sum 확인해보면 한글 한글자당 +1됨
		// 영어 1byte, 숫자 4byte, 한글 3byte, / 1byte
		
	}
}