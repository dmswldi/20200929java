package chap06.excercise;

public class ShopService {
	// 싱글톤- 객체 1개만 생성
	private static ShopService shopService = new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
		return shopService;
	}
	
}
