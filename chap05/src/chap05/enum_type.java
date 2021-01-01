package chap05;

import java.util.Calendar;

/*
 * �ڹٴ� ��ǻ���� ��¥ �� ����, �ð��� ���α׷����� ����� �� �ֵ��� �ϱ� ���� Date, Calendar, LocalDateTime ���� Ŭ������ �����Ѵ�.
 * LocalDateTime�� �ڹ� 8���� �����ϴ� API�̴�. ���� �������� ȣȯ���� ���� calendar�� �̿��ؼ� ��¥�� �ð��� ��� ����� �˾ƺ���.
 * Calendar�� �̿��ؼ� ��¥�� �ð��� ������
 */
public class enum_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calendar������ �����ϰ� Calendar.getInstance()�޼ҵ尡 �����ϴ� Calander��ü�� ��´�.
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR); //��
		int month = now.get(Calendar.MONTH)+1; //��(1~12)
		int day = now.get(Calendar.DAY_OF_MONTH); //��
		int week = now.get(Calendar.DAY_OF_WEEK); //����(1~7)
		int hour = now.get(Calendar.HOUR); //�ð�
		int minute = now.get(Calendar.MINUTE); //��
		int second = now.get(Calendar.SECOND); //��

		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
	}

}
