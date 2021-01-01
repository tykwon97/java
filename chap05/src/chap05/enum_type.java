package chap05;

import java.util.Calendar;

/*
 * 자바는 컴퓨터의 날짜 및 요일, 시간을 프로그램에서 사용할 수 있도록 하기 위해 Date, Calendar, LocalDateTime 등의 클래스를 제공한다.
 * LocalDateTime은 자바 8부터 지원하는 API이다. 이전 버전과의 호환성을 위해 calendar를 이용해서 날짜와 시간을 얻는 방법을 알아보자.
 * Calendar를 이용해서 날짜와 시간을 얻어오기
 */
public class enum_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calendar변수를 선언하고 Calendar.getInstance()메소드가 리턴하는 Calander객체를 얻는다.
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR); //년
		int month = now.get(Calendar.MONTH)+1; //월(1~12)
		int day = now.get(Calendar.DAY_OF_MONTH); //일
		int week = now.get(Calendar.DAY_OF_WEEK); //요일(1~7)
		int hour = now.get(Calendar.HOUR); //시간
		int minute = now.get(Calendar.MINUTE); //분
		int second = now.get(Calendar.SECOND); //초

		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
	}

}
