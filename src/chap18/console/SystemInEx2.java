package chap18.console;

import java.io.InputStream;

public class SystemInEx2 {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		
		byte[] datas = new byte[100];
		
//		System.out.print("아무 숫자: ");
//		System.out.println((char)is.read(datas));// 읽은 바이트 수 프린트...+엔터까지...
		
		System.out.print("이름: ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes-2);// \r\n 제외하고 저장
		
		System.out.print("하고 싶은 말: ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);// 저장 영역 설정함으로써 쓰레기값 저장 X
		
		System.out.println(name + " : " + comment);
	}
}