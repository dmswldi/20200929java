package chap18;

import java.io.File;
import java.net.URI;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {
	public static void main(String[] args) throws Exception {
		File dir = new File("src/chap18");
		File file1 = new File("src/chap18/file1.txt");
		File file2 = new File("src/chap18/file2.txt");
		//File file3 = new File(new URI("file:///C:/Users/admin/Documents/myworkspace/eclipse-workspace/myjava/src/chap18/file3.txt"));// 파일 객체를 URI 객체로 생성
		File file3 = new File(Paths.get("src/chap18/file3.txt").toUri());
		
		if(! dir.exists()) dir.mkdirs();
		if(! file1.exists()) file1.createNewFile();
		if(! file2.exists()) file2.createNewFile();
		if(! file3.exists()) file3.createNewFile();
		
		File chap18 = new File("src/chap18");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd	a HH:mm");// a는 오전, 오후
		File[] contents = chap18.listFiles();
		
		System.out.println("날짜		시간	 	형태	크기	이름");
		System.out.println("---------------------------------------------------------");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));;
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t" + file.getName());
			} else {
				System.out.print("\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
		
	}
}
