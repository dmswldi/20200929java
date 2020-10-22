package chap07.polymorphism.field;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		// run() 값에 따라 (0이 아니면 펑크) 출력 내용 다르게
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명: " +  (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("*** " +  location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
