package chap18.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {// 연결되어 있으면
			try {
				socket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
