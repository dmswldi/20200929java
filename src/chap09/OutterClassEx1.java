package chap09;

public class OutterClassEx1 {
	public static void main(String[] args) {
		OutterClass outter = new OutterClass();
		OutterClass.Nested nested = outter.new Nested();
		nested.print(); // 메인 안 했더니 얘가 오류나네
	}
}
