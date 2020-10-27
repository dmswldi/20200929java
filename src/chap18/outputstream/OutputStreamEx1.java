package chap18.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/outputstream/output.txt";
		OutputStream os = new FileOutputStream(path);
		
		// 파라미터 Integer는 4byte -> 3byte는 못 쓰고 1byte만 사용, 나머지 0 채워짐
		// write() : 실행하면 1byte 크기 파일 생김
		os.write(65); // 아스키코드 A
		os.write(66);// B
		
		byte[] data = new byte[3];
		data[0] = 67;
		data[1] = 68;
		data[2] = 69;// 3bytes
		
		os.write(data);
		os.write(data, 0, 2); // 배열, 시작 위치, 길이
		
		os.close();
	}
}
