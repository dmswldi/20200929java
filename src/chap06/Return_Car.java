package chap06;

public class Return_Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas잔량: " + gas + ")");
				return; // run() 함수 강제 종료
				// break;
			}
		}
		// System.out.println("while() 밖이지만 run() 안인 실행문"); 이거 실행하려면 return 대신 break;
	}
}
