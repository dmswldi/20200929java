package chap18.filterstream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/filterstream/BufferedReaderEx1.java";// 윈도우는 \(역슬래시), 유닉스는 /
		// \는 escape character이기 때문에 \ 쓰고 싶으면 \\ 두 번 써야함!
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		System.out.println(line);// 한 줄씩 읽기
		
		br.close();
		fr.close();
	}
}
