package chap05;

import java.util.Calendar;

public class EnumerationType { // 열거 타입
	public static void main(String[] args) {
		// 변수 선언
		Week today = Week.SUNDAY;
		Week birthday = null; // enum도 참조 타입이므로 null 가능
		
		// Calendar
		Calendar now = Calendar.getInstance(); // Calendar 객체 얻기
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH); // 월 0~11
		int day = now.get(Calendar.DAY_OF_MONTH);
//		int week = now.get(Calendar.DAY_OF_WEEK); // 요일 1(일)~7(토)
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour + ":" + minute);
		
		
		
		Week today0 = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today0 = Week.SUNDAY; break;
			case 2:
				today0 = Week.MONDAY; break;
			case 3:
				today0 = Week.TUESDAY; break;
			case 4:
				today0 = Week.WEDNESDAY; break;
			case 5:
				today0 = Week.THURSDAY; break;
			case 6:
				today0 = Week.FRIDAY; break;
			case 7:
				today0 = Week.SATURDAY; break;
				
		}
		System.out.println("오늘 요일: " + today0);
		
		if(today0 == Week.SUNDAY) {
			System.out.println("일요일에는 짜파게티");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
		
		// enum.name()
		Week today1 = Week.SUNDAY;
		System.out.println(today1.name());
		
		//enum.ordinal()
		int ordinal = today1.ordinal();
		System.out.println(ordinal);
		
		//enum.compareTo
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); // -2
		int result2 = day2.compareTo(day1); // 2
		System.out.println("result 1, 2: " + result1 + ", " + result2);
		
		// enum.valueOf
		System.out.println(args == null); 
		System.out.println(args.length); // null은 아닌데 길이가 0이야 ;;; -------------------
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay); // enum 객체로 전환
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			} else {
				System.out.println("평일이군요");
			}
		}
		
		
		// enum.value()
		Week[] days = Week.values();
		for(Week d : days) System.out.println(d);
		
		
	}
}
