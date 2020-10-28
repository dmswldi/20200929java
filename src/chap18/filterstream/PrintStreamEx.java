package chap18.filterstream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamEx {
	public static void main(String[] args) throws Exception {// 다양한 데이터 편리하게 출력
		// System.out.println(); out은 PrintStream
		// PrintWriter도 PrintStream이 가진 함수 다 사용 가능
		FileOutputStream fos = new FileOutputStream("src/chap18/filterstream/fileP.txt");
//		PrintStream ps = new PrintStream(fos);
		
		// PrintWriter 사용
//		FileWriter fw = new FileWriter("src/chap18/filterstream/fileP.txt");
		PrintWriter ps = new PrintWriter(fos); // 파라미터로 OutputStream, Writer 모두 가능
		
		ps.println("[프린트 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력합니다");
		
		ps.flush();
		ps.close();
		fos.close();
	}
}
