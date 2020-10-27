package chap18.filterstream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/filterstream/outputStreamReader.txt";
		FileOutputStream fos = new FileOutputStream(path);
		OutputStreamWriter osw = new OutputStreamWriter(fos); // osw로 감싸줘
		
		// fos.write('한'); // parameter int는 4byte, but 1byte만 쓰는데 2byte 쓰니까 깨짐
		osw.write('한');
				
		osw.close();// 닫아야 결과가 제대로 나오네
		fos.close();
	}
}
