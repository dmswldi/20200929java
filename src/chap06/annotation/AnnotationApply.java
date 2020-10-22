package chap06.annotation;

public class AnnotationApply {
	@AnnotationPrint
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@AnnotationPrint("*") // value에 값 넣기
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@AnnotationPrint(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}
