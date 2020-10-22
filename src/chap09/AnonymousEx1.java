package chap09;

public class AnonymousEx1 {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake(); // 오버라이딩 함수 호출 가능, work() 호출 불가
		
		anony.method1();
		
		anony.method2(
				new Person() {
					void study() {
						System.out.println("공부합니다.");
					}
					void wake(){
						System.out.println("8시에 일어납니다.");
						study();
					};
				}
		);
		
	}
}