package chap18.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {// 하나의 컴퓨터에 소켓 만들기
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			// serverSocket.bind(new InetSocketAddress("localhost", 5001));// localhost: 내 컴퓨터, IPv4 주소와 같음
			serverSocket.bind(new InetSocketAddress("172.30.1.38", 5001));// app 구분: port 번호로 / 여기선 5001을 포트 번호로
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();// 기다림, 창에 172.30.1.55:5001 써서 접속
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch(IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
