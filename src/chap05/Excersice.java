package chap05;

import java.util.Scanner;

public class Excersice {
	public static void main(String[] args) {
		// 7번
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) max = array[i];
		}
		
		System.out.println("max: " + max);
		
		
		// 8번
		int[][] array1 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int[] arr : array1) {
			for(int num : arr) {
				sum += num;
				avg += 1;
			}
		}
		avg = sum/avg;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
		
		// 9번
		boolean run = true;
		// boolean r = new boolean();
		// System.out.println(r); // 초기값 false 확인???
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				// 방법 2
				scores = new int[studentNum];
				
			} else if(selectNo == 2) {
				//int[] temp = new int[studentNum];
				for( int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					//temp[i] = sc.nextInt(); // 기존 scores 배열에 넣으면 NullPointerException, 선언 후 중괄호로 배열 못 넣는다 -> push도 안 되네,,,,,,
					// 방법 2
					scores[i] = sc.nextInt();// 왜 0 이 나오지................ㄴ
				}
				//scores = temp; // 배열 복사 이렇게도 되는데??????????
				
			} else if(selectNo == 3) {
				for( int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
				
			} else if(selectNo == 4) {
				double sum1 = 0.0;
				int max1 = 0;
				for(int score : scores) {
					sum1 += score;
					if(score > max1) max1 = score;
				}
				System.out.println("최고 점수: " + max1);
				System.out.println("평균 점수: " + sum1/studentNum);
				
			} else if(selectNo == 5) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
		
	}
}
