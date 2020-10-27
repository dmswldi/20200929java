package chap18.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream(
				"src/chap18/outputstream/sandwitch.jpg");// 바이트
		bis = new BufferedInputStream(fis);// 버퍼 담아서
		fos = new FileOutputStream(
				"src/chap18/outputstream/sandwitch-copy.jpg");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); bis.close(); fis.close();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		
		
		fis = new FileInputStream(
				"src/chap18/outputstream/sandwitch.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream(
				"src/chap18/outputstream/sandwitch-copy.jpg");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); bis.close(); fis.close(); // 가장 바깥(처음 연 것)만 닫아도 됨, 다 닫을 거면 마지막에 연 것 먼저 닫기
		System.out.println("사용했을 때: " + (end-start) + "ms");
	}
}
