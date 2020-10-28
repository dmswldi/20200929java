package chap18.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx2 {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));
//			socket.connect(new InetSocketAddress("172.30.1.12", 5001));
			// 이거 안 쓰고 socket = new Socket("172.30.1.12", 5001); 써도 됨!
			System.out.println("[연결 성공]");
			
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();// 서버로 데이터 보내
			message = "Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);// 얘 자체가 보내는 것. flush 안 해도 됨.
			// os.flush();
			System.out.println("[데이터 보내기 성공]");
			
			InputStream is = socket.getInputStream();// 서버로부터 데이터 받아
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");// 0부터 길이만큼 읽기
			System.out.println("[데이터 받기 성공] " + message);
			
			os.close();
			is.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		if(!socket.isClosed()) {// 소켓 열려있으면
			try {
				socket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
