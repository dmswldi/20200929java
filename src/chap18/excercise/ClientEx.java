package chap18.excercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) throws Exception { // 파일 이름과 데이터 보내기
		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream(); // 서버로 보낼 데이터
		
		String filePath = "src/chap18/excercise/bts.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		
		// 1. 파일 이름 보내기
		byte[] bytes = new byte[100];
		fileName.getBytes(0, fileName.length(), bytes, 0); // fileName.getBytes() 해버리면 데이터 크기 남는 부분에 쓰레기정보 들어감
		// The characters, converted to bytes, are copied into the subarray of dst starting at index dstBegin and ending at index. 
		os.write(bytes);// output.txt 먼저 보내, write() 자체가 보내는 것!
		
		System.out.println("[파일 보내기 시작] " + fileName);
		// 2. 파일 내용 읽어 보내기
		FileInputStream fis = new FileInputStream(file);
		int len;
		while( (len = fis.read(bytes)) != -1) {// bytes 길이만큼 읽어
			os.write(bytes, 0, len);// 길이 지정해서 write 해주기, 쓰레기값 안 들어가게
		} //
		
		// os.flush();// 안 해도 close가 알아서 해줌
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
