package chap18.inputstream;

import java.io.FileInputStream;

public class FileInputStreamEx {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
				"src/chap18/inputstream/FileInputStreamEx.java");
			int data;
			while( (data = fis.read() ) != -1) {
				System.out.write(data);// 아스키코드, char로 안 감싸도 ok
			}
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}