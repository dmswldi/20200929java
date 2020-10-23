package chap13.WildCards;

public class TestTEst {
	public static void main(String[] args) {
		My<Object> myo;
		My<String> mys = new My<>();
		My<?> myq;
		
		myq = mys; // 부모!
//		myo = mys;
	}
}

class My<T> {}
