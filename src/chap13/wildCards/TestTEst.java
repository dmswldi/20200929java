package chap13.wildCards;

public class TestTEst {
	public static void main(String[] args) {
		My<Object> myo;
		My<String> mys = new My<>();
		My<?> myq;
		
		myq = mys; // 부모!
//		myo = mys; // 부모-자식 x
		
//		myq = myo;
	}
}

class My<T> {}
