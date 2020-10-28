package chap18.filterstream;

import java.io.Serializable;


class ClassA implements Serializable {// 구현한 클래스 변경() -> 컴파일 시 UID값 변경
	static final long serialVersionUID = 1L; // 버전 정보 저장 -> 얘 있으면 InvalidClassException 안 남
	// 역직렬화할 때(객체 읽어올 때) 직렬화된 객체의 sender와 receiver가 클래스 로드하는 것을 verify
	
//		int field1;
	ClassB field2 = new ClassB();// instance field 중 transient 안 붙은 것만 직렬화 가능
	static int field3;
	transient int field4;
}

