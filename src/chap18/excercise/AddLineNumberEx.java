package chap18.excercise;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberEx {
	public static void main(String[] args) throws Exception {
		// 정확한 경로로 수정하세요.
		String filePath = "src/chap18/excercise/AddLineNumberEx.java";
		
		// 소스 파일 읽고 라인 번호 추가해 출력
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String data;
		int cnt = 0;
		while((data = br.readLine()) != null) {
			cnt++;
			System.out.println(cnt + ": " + data);
		}
		
		br.close(); fr.close();
	}
}
