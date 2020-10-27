package chap18.writer;

import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/writer/FileCopy.java";
		String des = "src/chap18/writer/file-copy.txt";
		
		// Reader, Writer 사용
		File file = new File(des);// 파일 만들어
		
		Reader fr = new FileReader(src);
		Writer fw = new FileWriter(file, false);// false 걍 지우고 다시 쓰는
		
		int Cnt = 0;
		char[] cbuf = new char[100];
		while(fr.read(cbuf) != -1) {
			Cnt++;
			fw.write(cbuf);
		}
		System.out.println(Cnt);
		
		fw.flush();
		fw.close();
		fr.close();
		System.out.println("파일 복사 완료");
		
	}
}
