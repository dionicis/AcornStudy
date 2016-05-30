package d20160524;

import java.util.Calendar;

public class UtilEx3 {
	public static void main(String[] args) {
		// static 변수, static method는
		// instance화 하지 않고도 바로 사용이 가능

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println("올해는 "+year+"년 입니다.");
		int month = cal.get(Calendar.MONTH);
		System.out.println("이번달은 "+(month+1)+"월 입니다.");
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("오늘은 "+day+"일 입니다.");
		
	}
}
