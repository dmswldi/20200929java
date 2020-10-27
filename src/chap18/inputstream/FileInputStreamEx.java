package chap18.inputstream;

import java.io.FileInputStream;

public class FileInputStreamEx {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
				"src/chap18/inputstream/FileInputStreamEx.java");
			int data;
			while( (data = fis.read() ) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
