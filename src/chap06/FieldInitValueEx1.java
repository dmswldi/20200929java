package chap06;

public class FieldInitValueEx1 {
	public static void main(String[] args) {
		// class는 초기값 없어도 0, 0.0, null, false로 초기화 되어 있음
		
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField: " + fiv.byteFiled);
		System.out.println("shortField: " + fiv.shortFiled);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);
		System.out.println("booleanField: " + fiv.booleanField);
		System.out.println("charField: " + fiv.charFiled);
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);
		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
	}
}
