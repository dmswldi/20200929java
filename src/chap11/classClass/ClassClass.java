package chap11.classClass;

import java.lang.reflect.Method;

import chap07.polymorphism.field.Car;

public class ClassClass {
	public static void main(String[] args) throws Exception {
		// 1. 문자열로 얻음
		Class clazz;
		clazz = Class.forName("java.lang.String");
		
		// 2. 객체로부터 얻음
		String s = "java";
		Class c2 = s.getClass();
		
		// 3. class 키워드로 얻음
		Class c3 = String.class;
		
		System.out.println(clazz == c2);
		System.out.println(c2 == c3);
		
		Method m = clazz.getMethod("getBytes"); // getByte()
		System.out.println(m);
		
		
		System.out.println("-------------");
		
		Car car = new Car();
		Class clazz1 = car.getClass(); // 객체 생성 후 getClass()
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("chap06.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
