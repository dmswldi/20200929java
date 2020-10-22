package chap06.annotation;

import java.lang.reflect.Method;

public class MyAnnotationEx2 {
	public static void main(String[] args) throws Exception {
		Class clazz = MyAnnotationEx.class;
		Method method = clazz.getMethod("method1");
		boolean anno = method.isAnnotationPresent(MyAnnotation.class);
		System.out.println(anno);
	}
}
