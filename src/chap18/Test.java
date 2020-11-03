package chap18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

public class Test {
	public static void main(String[] args) throws Exception {
		//InputStream is = System.in;//안1 녕 하 -> 하 깨짐
		
		File file = new File("src/chap18/test1.txt");
		Writer writer = new FileWriter(file);
		
		int readByteNo;
		byte[] data = new byte[3];// byte 길이가 작으면 문제 생김!
	/*	while((readByteNo = System.in.read(data)) != -1){
			String s = new String(data, 0, readByteNo);
			System.out.println(readByteNo +  " " + s);			 
			System.out.println("s 길이: " + s.length());// 깨진 걸 각자 1글자로 읽어,,,
			writer.write(s);// 왜 String으로는 write가 안 돼????????????????? 텍파 깨지나 보려고 하는데
		}*/
		
/*		String s = "안녕";
		writer.write(s); // 왜 스트링 쓰는 게 안 됨??*/
		
//		readByteNo = System.in.read(data);// data 배열로 안녕 받으면 녕 깨지잖아
//		String s = new String(data, 0, readByteNo);
//		System.out.print(readByteNo +  " " + s);			
			
	}
}
