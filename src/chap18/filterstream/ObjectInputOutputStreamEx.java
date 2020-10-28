package chap18.filterstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamEx {
	public static void main(String[] args) throws Exception {
		// .dat: 일반 텍스트 또는 이진 저장, 응용 프로그램에서만 사용하도록 설계
		// 특정 프로그램 내에서 프로그램 설정을 저장하는 데 사용
		FileOutputStream fos = new FileOutputStream("src/chap18/filterstream/Object.dat");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1, 2, 3});
		oos.writeObject(new String("홍길동"));
		
		oos.flush(); oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("src/chap18/filterstream/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// Output 순으로 Input, instanceof 사용 후 형변환
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
	}
}
