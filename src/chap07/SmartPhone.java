package chap07;

public class SmartPhone extends Phone { // 실체 클래스
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSerach() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
