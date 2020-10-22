package chap06.annotation;

import java.lang.reflect.Method;

public class AnnotationPrintEx1 {
	public static void main(String[] args) {
		// reflection: AnnotationApply class에 선언된 메소드 얻기
		Method[] declaredMethods = AnnotationApply.class.getDeclaredMethods();
		/* System.out.println(declaredMethods.length); // 25
		for(int i = 0; i < declaredMethods.length; i++)
		System.out.println(declaredMethods[i].getName()); */
		
		for(Method method : declaredMethods) { // 순서가 실행할 때마다 지 맘대로네
			if(method.isAnnotationPresent(AnnotationPrint.class)) { // 지정한 annotation이 적용됐는지
				AnnotationPrint annotationPrint = method.getAnnotation(AnnotationPrint.class); // AnnotationPrint(annotation) 객체 얻기
				
				System.out.println("[" + method.getName() + "]");
				for(int i = 0; i < annotationPrint.number(); i++) {
					System.out.print(annotationPrint.value());
				}
				System.out.println();
				
				try {
					// instance method라 객체 생성 후 사용.
					method.invoke(new AnnotationApply()); // AnnotationApply 객체 생성 후 AnnotationApply 객체의 메소드 호출(실행)
				} catch (Exception e) {
					System.out.println("에러 발생");
					e.printStackTrace();
				}
				
				System.out.println();
			}
		}
	}
}
