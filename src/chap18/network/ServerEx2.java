package chap18.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
//			serverSocket.bind(new InetSocketAddress("172.30.1.38", 5001));
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();// 서버소켓이 커넥션 기다렸다 받아서 소켓 만들어 저장, client 1 : server 1 소켓 생성
				InetSocketAddress isa =  (InetSocketAddress) socket.getRemoteSocketAddress();// 소켓 endpoint 주소 ...?
				System.out.println("[연결 수락함] " + isa.getHostName());
				
				byte[] bytes = null;
				String message = null;
				
				InputStream is = socket.getInputStream();// 꺼내 -> 클라이언트가 보낸 정보 읽어
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[데이터 받기 성공]: " + message);
				
				OutputStream os = socket.getOutputStream();// 꺼내 -> 클라이언트한테 정보 보내
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				// os.flush();
				System.out.println("[데이터 보내기 성공]");
				
				is.close();
				os.close();
				socket.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
