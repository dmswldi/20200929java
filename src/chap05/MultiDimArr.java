package chap05;

public class MultiDimArr {
	public static void main(String[] args) {
		int[][] javaScores = { {95 ,80}, {92, 96, 80} };
		for(int i = 0; i < javaScores.length; i++) {
			for(int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "] = " + javaScores[i][k]);
			}
		}
		
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = new String("Java");
		strArray[2] = "Java";
		
		System.out.println(strArray[0] == strArray[1]); // F
		System.out.println(strArray[1] == strArray[2]); // F
		System.out.println(strArray[0] == strArray[2]); // T, 같은 객체 참조
		
		System.out.println(strArray[1].equals(strArray[2])); // T
		
		
		// 배열 복사 1. for
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		// mini test -> 배열 복사 0. newArr = oldArr; 
		int[] newArr;
		newArr = oldIntArray;
		for(int i : newArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for(int i = 0; i < newIntArray.length; i++) { // 남은 자리는 초기값으로 자동 초기화
			System.out.print(newIntArray[i] + " ");
		}
		System.out.println("\r\n========");
		
		//배열 복사 2. System.arraycopy -> shallow copy(얕은 복사) <-> deep copy(깊은 복사): 참조하는 객체도 별도로 생성
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; i++) { // 남은 자리는 초기값으로 자동 초기화
			System.out.print(newStrArray[i] + " ");
		}
		System.out.println("\r\n========");
		
		
		// 향상된 for문
		int[] scores = {95, 71, 84, 93, 88};
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균: " + avg);
		
		
		
	}
}
