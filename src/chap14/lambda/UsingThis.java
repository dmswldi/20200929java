package chap14.lambda;

public class UsingThis {
	//System.out.println(""); // 클래스 안에서는 실행문(메소드) XXX
	public int outterField = 10;
	
	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
		//inner.fi.method();
		//inner.s.length();// 위에 한 건 이거랑 같음,,,
	}
	
	class Inner {// 클래스 안에는 필드, 생성자, 메소드만 생성 가능
		int innerField = 20;
		
/*		String s = "";
		
		MyFunctionalInterface fi = () -> {// 클래스 안에 필드 선언한 꼴, 실행문은 메소드 안에서 가능!!!!!
			System.out.println("outterField: " + outterField);
			System.out.println("outterField: " + UsingThis.this.outterField + "\n");// 바깥 객체의 참조 얻기
			
			System.out.println("innerField: " + innerField);
			System.out.println("innerField: " + this.innerField + "\n");
		};
*/		
		
		void method() {// 메소드로 선언
			MyFunctionalInterface fi = () -> {// 익명 객체 생성
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");// 바깥 객체의 참조 얻기
				
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n");
			};
			
			fi.method();
		}
	}
	
	interface MyFunctionalInterface {
		public void method();
	}
}
