package chap18.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("src/chap18/filterstream/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5); // 8byte
		dos.writeInt(1);
		
		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("src/chap18/filterstream/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 2; i++) {// Outpt -> Input 할 때 쓴 순서대로 읽어와야 함 : 데이터 타입 크기가 달라서 꺠짐
			String name= dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close(); fis.close();
	}
		
}
