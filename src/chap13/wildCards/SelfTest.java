package chap13.wildCards;

import java.util.ArrayList;
import java.util.List;

public class SelfTest {
	
	private static void addObjectToList1(final List<?> aList, final Object o) { // compile error? -> you cannot add anything except null to a List<?>
//	    aList.add(o); // ?????
	}

	private static void addObjectToList2(final List<Object> aList, final Object o) { // main()에서 call이 안 됨
	    aList.add(o);
	}

	private static <T> void addObjectToList3(final List<T> aList, final T o) { // 이렇게 해라!
	    aList.add(o);// T 타입에 T 타입 넣기
	}
	

	
	public static void print(List<Number> list) {
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		addObjectToList1(new ArrayList<Object>(), new Object());// 얘는 되는데 아래가 안 돼서 컴파일 에러
		addObjectToList1(new ArrayList<String>(), new Object());// List 파라미터 타입에 어떤 값이 오든 두 번째 파라미터 사용이 가능해야 함
		
		addObjectToList2(new ArrayList<Object>(), new Object());// List<Object> is not a super type of List<String>.
//		addObjectToList2(new ArrayList<String>(), new Object());// error

		print(new ArrayList<Number>());
		// print(new ArrayList<Double>()); // X
		// ArrayList<Number> list = new ArrayList<Double>(); // Number는 Double과 상속 관계지만, List<Number>과 List<Double>은 관계 XXX
	}
}
