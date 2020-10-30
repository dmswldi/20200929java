package chap18.filterstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NonSerializableParentEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("src/chap18/filterstream/NonSerial.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Child child = new Child();
		child.field1 = "홍길동";
		child.field2 = "홍삼원";
		oos.writeObject(child);// final 함수인데 재정의해서 쓰는 건가......?????
		oos.flush(); oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("src/chap18/filterstream/NonSerial.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child v = (Child) ois.readObject();// 얘도 final인데 final 함수 잘 호출해서 Object 리턴하는데...?
		System.out.println("field1: " + v.field1);
		System.out.println("field2: " + v.field2);
		ois.close(); fis.close();
	}
}
/*
ObjectOutputStream {
	
	final void writeObject(Object o) {
		;;
		;;
		o.writeObject(this);
		;;
		
	}
}*/

class Parent {
	public String field1;
}
class Child extends Parent implements Serializable {// 자식만 Serializable 구현
	public String field2;
	
	// 직렬화할 때 자동 호출 : private 선언해야 자동 호출됨!
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(field1); // Serializable 구현하지 않은 부모 필드 직접 출력시켜야 함
		out.defaultWriteObject();// 자식 객체 필드값 직렬화
	}
	
	// 역직렬화할 때 자동 호출
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		field1 = in.readUTF();// 부모 필드값 직접 읽기, 왜 직접 넣어주나?????????? field1 선언 안 하니까 null 나오네
		in.defaultReadObject();// 자식 필드값 역직렬화
	}
}
