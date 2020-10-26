package chap15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws IOException {
		Map<String, String> map;
		// 파일을 읽어서 map에 설정 파일(.properties)의 정보를 저장
		// Class Properties : Map<Object,Object> -> key나 value가 String 아닌 건 discouraged
	
		Properties properties = new Properties(); // 여기에 (key, value) 쌍 저장, Map<Object,Object> 타입
		
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8"); // throws UnsupportedEncodingException
		properties.load(new FileReader(path)); // throws FileNotFoundException, put 한 적 없지만 load가 읽어놔서 get 가능
		
		System.out.println(properties.size());
		// Object urlValue = properties.get("url"); // Object 리턴
		String driver = properties.getProperty("driver");
		String urlValue = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println(urlValue);
		System.out.println(driver);
		System.out.println(username);
		System.out.println(password);
	}
}
