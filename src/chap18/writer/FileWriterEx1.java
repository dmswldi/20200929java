package chap18.writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/chap18/writer/file.txt");// 파일 만들어
		FileWriter fw = new FileWriter(file, true); // 파일에 내용 넣기, 기존 파일에 append
		
		fw.write("FileWriter는 한글로 된 \r\n");
		fw.write("문자열을 바로 출력할 수 있다. \r\n");
		
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}
