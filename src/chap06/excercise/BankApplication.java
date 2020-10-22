package chap06.excercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BankApplication {
	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			while(selectNo < 1 || selectNo > 5) {
				System.out.print("1에서 5 사이의 정수값을 입력해주세요> ");
				selectNo = scanner.nextInt();
			}
			
			 // 1-5 사이 값만 받기: switch문
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}
			
			
		}
	
		
	}

	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
		String regExp = "\\d{3}-\\d{3}"; // 정규표현식으로 000-000 > 정확히 안 됨 ㅠㅠ
		// String regExp = "(^[0-9]{3}-[0-9]{3}$)"; // ...
		// Pattern pattern = Pattern.compile("(^[0-9]{3}-[0-9]{3}$)");
		
		System.out.print("계좌번호: ");
		scanner.nextLine(); // selectNo에서 nextInt하고 남은 \r\n 읽기
		String ano = scanner.nextLine();
		if(!Pattern.matches(regExp, ano)) {
			System.out.print("[000-000] 형식에 맞추어 작성해주세요> " );
			ano = scanner.nextLine();
		}
		/*if(!pattern.matcher(ano).find()) {
			System.out.print("[000-000] 형식에 맞추어 작성해주세요> " );
			ano = scanner.nextLine();
		}*/
		
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		BankAccount b = new BankAccount(ano, owner, balance);
		
//		for(BankAccount ba : accountArray) { // for문 이렇게 사용하면 원래값엔 영향 X인 듯,,,
//			if(ba == null) {
//				// ba = new BankAccount(ano, owner, balance); // array == null why????????
//				ba = b; // 주소 복사, accountArray에 영향 X
//				System.out.println("결과: 계좌가 생성되었습니다.");
//				break;
//			}
//		} // 이건 안 됨 XXXXXXXXXXX
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = b;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
		
		
	}
	
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		
		for(BankAccount ba : accountArray) {
			if(ba != null) {
				System.out.println(ba.getAno() + "\t" + ba.getOwner() + "\t" + ba.getBalance());
			}
		}
		
		
	}
	
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		scanner.nextLine();
		String ano = scanner.nextLine();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		
		// 계좌 찾아서 setBalance()
		findAccount(ano).setBalance( findAccount(ano).getBalance() + balance );
		
		System.out.println("결과: 예금이 성공되었습니다.");
	}

	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		scanner.nextLine();
		String ano = scanner.nextLine();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		
		// 계좌 찾아서 setBalance()
		findAccount(ano).setBalance( findAccount(ano).getBalance() - balance );
		
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	// ano와 동일한 Account 객체 찾기
	private static BankAccount findAccount(String ano) {
		for(BankAccount ba : accountArray) {
			if(ba != null & ba.getAno().equals(ano)) { // equals 조심
				return ba;
			}
		}
		
		return null;
	}
	
}
