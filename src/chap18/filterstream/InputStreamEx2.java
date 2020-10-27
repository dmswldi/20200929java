package chap18.filterstream;

public class InputStreamEx2 {
	public static void main(String[] args) throws Exception {
		System.out.println("입력> ");
		System.out.println((char) System.in.read());// 문자 단위 입력 받고 싶으면 -> isr로 감싸서 써야 함
		System.out.println((char) System.in.read());// 얘는 한글 입력 시 깨짐
		System.out.println((char) System.in.read());
		System.out.println((char) System.in.read());
	}
}
