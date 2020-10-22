package chap10;

public class FileClose {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
