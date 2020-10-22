package chap11.Object;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class StringEx {
	public static void main(String[] args) throws IOException {
/*		String s1 = new String(byte[] bytes);
		String s2 = new String(byte[] bytes, String charsetName);
		String s3 = new String(byte[] bytes, int offset, int length);
		String s4 = new String(byte[] bytes, int offset, int length, String charsetName) */
				
		// String 생성자, 바이트->문자열
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};// 아스키코드
		
		String s = new String(bytes);
		System.out.println(s);
		String s1 = new String(bytes, 6, 4); // 6부터 4개
		System.out.println(s1);
		
		
		byte[] bytes0 = new byte[100];
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes0); // 바이트 읽기, 읽은 바이트 수 리턴(\r\n까지 +2)
		
		String s0 = new String(bytes0, 0, readByteNo-2); // 배열을 문자열로, \r\n 제외
		System.out.println(readByteNo + ", " + s0);
		
		
		// .charAt()
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
		
		
		// .equals(), String에서 ==는 번지수 비교
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		String strVar3 = "신민철";
		if(strVar3 == strVar1) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 Strihg 객체를 참조");
		}
		if(strVar3.equals(strVar1)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
		
		// .getBytes()
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes(); // "EUC-KR"으로 여기선 안 되네?
		System.out.println("bytes1.length: " + bytes1.length); // string은 length(), byte는 length
		System.out.println(bytes1.toString()); // 클래스이름 + @ + 해시코드값
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);
		
		try {
			// EUC-KR을 이용한 인코딩, 디코딩
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			// UTF-8을 이용한 인코딩, 디코딩
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes2.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes2->String: " + str3);
			
		} catch (UnsupportedEncodingException e){
			e.printStackTrace();
		}
		
		
		// .indexOf()=int 문자열 포함 여부!!!! ❤
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		if(subject.indexOf("자바") != -1) { // 포함 x면
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		
		// .length()
		String ssn1 = "7306241230123";
		int length = ssn1.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다");
		} else {
			System.out.println("주민번호 자리수가 틀립니다");
		}
		
		
		// .replace()
		String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 api를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr + " / " + newStr);
		
		
		// .substring()
		String ssn2 = "880815-1234567";
		String firstNum = ssn2.substring(0, 6);
		System.out.println(firstNum);
		String secondNum = ssn2.substring(7);
		System.out.println(secondNum);
		
		
		// toLowerCase(), toUpperCase() -> .equalsIgnoreCase() ❤
		String str2 = "Java Programming";
		String str3 = "JAVA Programming";
		System.out.println(str2.equals(str3)); // false
		String lowerStr1 = str2.toLowerCase();
		String lowerStr2 = str3.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // true
		
		System.out.println(str2.equalsIgnoreCase(str3)); // true
		
		
		// .trim()
		String tel1 = "  02";
		String tel2 = "123   ";
		String tel3 = "   1234    ";
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
		
		
		// .valueOf() ❤
		String s01 = String.valueOf(10);
		String s02 = String.valueOf(10.5);
		String s03 = String.valueOf(true);
		
		System.out.println(s01 + ", " + s02 + ", " + s03);
		
		// 객체 타입 확인
		System.out.println(s01 instanceof String);
		System.out.println(s02.getClass().getName());
		
		
		
		// StringTokenizer 문자열(token) 분리
		// 1. split()
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		for(String name : names) {
			System.out.println(name);
		}
		// 2. StringTokenizer - countTokens(), hasMoreTokens(), nextToken()
		// how1
		String text1 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(text1, "/"); // 기본 구분자는 공백!
		int countTokens = st.countTokens(); // 남아있는 토큰의 수
		
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		//how2
		System.out.println("=====");
		st = new StringTokenizer(text1, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
		
		// 문자열 수정 잦음 -> 힙에 객체 수 증가 -> 프로그램 성능 저하
		// 따라서 문자열 수정이 잦을 시 StringBuffer 또는 StringBuilder 클래스 사용 권장! ❤
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java "); // 추가
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4,  "2"); // 삽입
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6'); // 변경
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); // 대치
		System.out.println(sb.toString());
		
		sb.delete(4, 5); // 삭제
		System.out.println(sb.toString());
		
		int l = sb.length();
		System.out.println("총 문자 수: " + l);
		
		String result = sb.toString(); // 버퍼 내 값 수정 후에 String 객체에 넣기!!
		System.out.println(result);
	}
}
