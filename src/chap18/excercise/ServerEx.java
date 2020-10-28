package chap18.excercise;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("localhost", 5001));// 소켓 주소 bind
		// server에서 bind와 client에서 connect는 '이 소켓이 내 소켓이다'
		
		System.out.println("[서버 시작]");
		
		while(true) {
			try {
				Socket socket = serverSocket.accept(); // 요청 기다려서
				
				InputStream is = socket.getInputStream();// 소켓에서 읽을 거야
				
				byte[] bytes = new byte[1000];
				int readByteCount = -1;
				
				// 100byte만 읽고
				readByteCount = is.read(bytes, 0, 100); // 바이트로 읽어서
				String fileName = new String(bytes, 0, readByteCount, "UTF-8");
				fileName = fileName.trim();// 일단 100bytes 읽고 공백 잘라내
				
				System.out.println("[파일 받기 시작] " + fileName);
				// 파일 받아서 서버에 저장
				FileOutputStream fos = new FileOutputStream("src/chap18/excercise/new"+fileName);
				// String message = new String(bytes, 101, readByteCount, "UTF-8"); // 나머지 데이터
				while((readByteCount = is.read(bytes)) != -1) {
					fos.write(bytes, 0, readByteCount);
				}
				
				// fos.write(message.getBytes());
				// fos.flush();
				System.out.println("[파일 받기 완료]");
				
				fos.close();
				is.close();
				socket.close();
				
			} catch(Exception e) {
				e.printStackTrace();
				break;
			}
		}
		
		serverSocket.close();
		System.out.println("[서버 종료]");
	}
}
