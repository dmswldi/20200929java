package chap18.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/writer/writer.txt";
		Writer writer = new FileWriter(path);// String으로 path 넣기
		
		writer.write('한');// 3byte -> os마다 다름,,
		
		char[] arr = new char[5];
		arr[0] = '자';
		arr[1] = '바';
		arr[2] = '신';
		arr[3] = '용';
		arr[4] = '권';// 6*3=18byte
		
		writer.write(arr);
		writer.write(arr, 2, 3); // 27
		writer.write("\n이것이자바다"); // \n은 1 byte
		
		writer.close();
	}
}
