package chap18.filterstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) throws Exception {
		// 뭔갈 읽는다 = 비용이 크다, 하드웨어에서 뭘 읽어서 cpu에 뭘 처리하고...
		// Buffer라는 임시 저장공간 사용
		String path = "src/chap18/outputstream/sandwitch.jpg";
		FileInputStream fis = new FileInputStream(path);// 하드디스크에서 읽기
		BufferedInputStream bis = new BufferedInputStream(fis); // buffer 사용: 더 빠름, 하드디스크와 메모리 사이에 미리 저장
		
		long start = System.currentTimeMillis();
		while(bis.read() != -1) {// fis or bis 사용
			
		}
		long end = System.currentTimeMillis();
		System.out.println("총 읽은 시간: " + (end-start) + "ms");
		fis.close();
		
		
	}
}
