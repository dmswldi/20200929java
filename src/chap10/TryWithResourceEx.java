package chap10;

public class TryWithResourceEx { // 예외 발생 or 실행 완료 - close()로 리소스 닫기 자동
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); // 강제 예외 발생
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}
