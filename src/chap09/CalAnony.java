package chap09;

public class CalAnony {
	private int field; // 얘는 필드
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		// arg1 = 20;
		// arg2 = 20;
		
		// var1 = 30;
		var2 = 30; // 익명 객체 내부에서 쓰이지 않으면 final이 아니기 때문에 수정 가능
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1; // 익명 객체 내부에서 쓰인 애들(매개변수, 로컬변수)은 final 특성을 갖게 됨
				return result;
			}
		};
		
		System.out.println(calc.sum()); // 오버라이딩한 부모 함수 호출 가능
	}
}
