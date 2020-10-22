package chap06.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD}) // ElementType은 enum type, ElementType.TYPE는 클래스, 인터페이스, 열거 타입
@Retention(RetentionPolicy.RUNTIME) // 기본은 SOURCE, 컴파일할 때만.
public @interface MyAnnotation {
	// Element
	String value() default "123";
	int number() default 3;
	String[] names() default {"a", "b"};
}
