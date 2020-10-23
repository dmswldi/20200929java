package chap11.classClass;

public class NewInstanceEx {
	public static void main(String[] args) {
		try {
			int i = 3;
			String t = "chap11.classClass.ReceiveAction";
			if (i > 2) { // 런타임 시 클래스 이름이 결정, 클래스 이름은 ReceiveAction or SendAction
				t = "chap11.classClass.SendAction";
			}
			
			Class clazz = Class.forName(t);
			Class clazz2 = Class.forName("chap11.classClass.ReceiveAction");
			// Class clazz3 = Class.forName("chap11.classClass.Action");
			// newInstance()는 Object 타입 리턴(T 타입), 강제 타입 변환
			Action action = (SendAction) clazz.newInstance(); // 인터페이스 구현 객체 사용 -> 인터페이스 변수 = 구현 객체;
			Action action2 = (Action) clazz2.newInstance();
			// Action action3 = (Action) clazz3.newInstance(); // 런타임 에러. 인터페이스는 객체 생성 X
			// 밑에서 어떤 타입을 쓸 건지에 따라 Action or SendAction으로 강제 형변환
			action.execute();
			action2.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
