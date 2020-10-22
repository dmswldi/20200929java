package chap10.excercise;

public class TryCatchFinallyEx {
	public static void main(String[] args) {
		String[] strArray = {"10", "2a"};
		int value = 0;
		for(int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음"); // 2 출력
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음"); // 1 출력
			} finally {
				System.out.println(value); // 10
			}
		}
	}
}
